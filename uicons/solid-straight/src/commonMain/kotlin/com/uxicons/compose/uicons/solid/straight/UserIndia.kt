package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _UserIndia: ImageVector? = null

val Icons.Ss.UserIndia: ImageVector
    get() = _UserIndia ?: UXIcon(name = "UserIndia") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21f, 21.33f)
                verticalLineToRelative(2.67f)
                horizontalLineToRelative(-5f)
                verticalLineToRelative(-7.97f)
                curveToRelative(2.78f, 0.14f, 5f, 2.46f, 5f, 5.31f)
                close()
                moveTo(3f, 21.33f)
                verticalLineToRelative(2.67f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(-7.97f)
                curveToRelative(-2.78f, 0.14f, -5f, 2.46f, -5f, 5.31f)
                close()
                moveTo(12f, 18f)
                curveToRelative(-0.83f, 0f, -1.52f, -0.44f, -2f, -0.85f)
                verticalLineToRelative(6.85f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(-6.85f)
                curveToRelative(-0.48f, 0.41f, -1.17f, 0.85f, -2f, 0.85f)
                close()
                moveTo(18.33f, 8.78f)
                curveToRelative(0.35f, -0.99f, 0.67f, -2.42f, 0.67f, -4.28f)
                curveToRelative(0f, -3f, -3.5f, -4.5f, -7f, -4.5f)
                curveToRelative(-1.26f, 0f, -2.52f, 0.2f, -3.61f, 0.58f)
                curveToRelative(4.06f, 4.73f, 8.39f, 7.35f, 9.94f, 8.2f)
                close()
                moveTo(10.46f, 5.56f)
                curveToRelative(-1.26f, -1.14f, -2.58f, -2.48f, -3.88f, -4.03f)
                curveToRelative(-0.96f, 0.73f, -1.58f, 1.72f, -1.58f, 2.97f)
                curveToRelative(0f, 1.87f, 0.33f, 3.29f, 0.67f, 4.28f)
                curveToRelative(0.88f, -0.48f, 2.67f, -1.54f, 4.78f, -3.22f)
                close()
                moveTo(12.0f, 6.89f)
                curveToRelative(-2.69f, 2.19f, -4.92f, 3.43f, -5.73f, 3.85f)
                curveToRelative(0.74f, 2.47f, 3.03f, 4.26f, 5.74f, 4.26f)
                reflectiveCurveToRelative(4.99f, -1.8f, 5.74f, -4.26f)
                curveToRelative(-0.82f, -0.42f, -3.05f, -1.65f, -5.74f, -3.85f)
                close()
            }
        }.also { _UserIndia = it}
