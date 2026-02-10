package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _UserSuitcase: ImageVector? = null

val Icons.Bs.UserSuitcase: ImageVector
    get() = _UserSuitcase ?: UXIcon(name = "UserSuitcase") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(14f, 2.5f)
                curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.12f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.12f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.12f, -2.5f, -2.5f)
                close()
                moveTo(18.46f, 13.16f)
                lineToRelative(4.13f, 2.01f)
                lineToRelative(1.31f, -2.7f)
                lineToRelative(-3.36f, -1.64f)
                lineToRelative(-2.17f, -3.46f)
                lineToRelative(-0.14f, -0.19f)
                curveToRelative(-0.67f, -0.76f, -1.62f, -1.2f, -2.63f, -1.2f)
                horizontalLineToRelative(-1.81f)
                lineToRelative(-5.74f, 1.75f)
                lineToRelative(-1.35f, 3.27f)
                lineToRelative(2.77f, 1.14f)
                lineToRelative(0.81f, -1.96f)
                lineToRelative(2.57f, -0.78f)
                lineToRelative(-0.75f, 3.21f)
                curveToRelative(-0.35f, 1.5f, 0.34f, 3.08f, 1.68f, 3.84f)
                lineToRelative(4.23f, 2.4f)
                verticalLineToRelative(5.13f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-6.87f)
                lineToRelative(-4.49f, -2.55f)
                lineToRelative(0.85f, -3.17f)
                lineToRelative(1.1f, 1.75f)
                close()
                moveTo(10.22f, 17.61f)
                lineToRelative(-2.02f, 4.08f)
                lineTo(0.04f, 17.77f)
                lineToRelative(2.02f, -4.08f)
                curveToRelative(0.36f, -0.75f, 1.25f, -1.06f, 2.0f, -0.7f)
                lineToRelative(0.55f, 0.26f)
                lineToRelative(0.02f, -0.05f)
                curveToRelative(0.35f, -0.76f, 1.25f, -1.08f, 2.0f, -0.72f)
                lineToRelative(1.58f, 0.75f)
                curveToRelative(0.74f, 0.35f, 1.06f, 1.24f, 0.72f, 1.99f)
                lineToRelative(-0.04f, 0.08f)
                lineToRelative(0.63f, 0.3f)
                curveToRelative(0.75f, 0.36f, 1.06f, 1.25f, 0.7f, 2.0f)
                close()
                moveTo(11.83f, 17.5f)
                lineToRelative(-0.35f, 1.51f)
                lineToRelative(-2.27f, 4.98f)
                horizontalLineToRelative(3.3f)
                lineToRelative(1.76f, -3.88f)
                lineToRelative(0.22f, -0.94f)
                lineToRelative(-1.72f, -0.97f)
                curveToRelative(-0.35f, -0.2f, -0.66f, -0.44f, -0.95f, -0.71f)
                close()
            }
        }.also { _UserSuitcase = it}
