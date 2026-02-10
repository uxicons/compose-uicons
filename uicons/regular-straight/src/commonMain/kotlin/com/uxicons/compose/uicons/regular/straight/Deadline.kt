package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Deadline: ImageVector? = null

val Icons.Rs.Deadline: ImageVector
    get() = _Deadline ?: UXIcon(name = "Deadline") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(13f, 6f)
                verticalLineToRelative(5.28f)
                curveToRelative(0.59f, 0.35f, 1f, 0.98f, 1f, 1.72f)
                curveToRelative(0f, 1.1f, -0.9f, 2f, -2f, 2f)
                reflectiveCurveToRelative(-2f, -0.9f, -2f, -2f)
                curveToRelative(0f, -0.74f, 0.41f, -1.38f, 1f, -1.72f)
                verticalLineToRelative(-5.28f)
                close()
                moveTo(24f, 24f)
                horizontalLineToRelative(-14f)
                lineToRelative(7f, -12f)
                close()
                moveTo(18f, 21f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(2f)
                close()
                moveTo(18f, 20f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(4f)
                close()
                moveTo(3f, 13f)
                curveToRelative(0f, -4.96f, 4.04f, -9f, 9f, -9f)
                reflectiveCurveToRelative(9f, 4.04f, 9f, 9f)
                curveToRelative(0f, 0.56f, -0.06f, 1.1f, -0.15f, 1.62f)
                lineToRelative(1.39f, 2.38f)
                curveToRelative(0.49f, -1.24f, 0.77f, -2.59f, 0.77f, -4.0f)
                curveToRelative(0f, -2.88f, -1.12f, -5.5f, -2.94f, -7.46f)
                lineToRelative(0.98f, -1.09f)
                lineToRelative(0.88f, 0.88f)
                lineToRelative(1.41f, -1.41f)
                lineToRelative(-3.19f, -3.19f)
                lineToRelative(-1.41f, 1.41f)
                lineToRelative(0.89f, 0.89f)
                lineToRelative(-1.05f, 1.17f)
                curveToRelative(-1.58f, -1.19f, -3.49f, -1.96f, -5.57f, -2.15f)
                verticalLineToRelative(-2.05f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(2.05f)
                curveToRelative(-2.08f, 0.19f, -3.99f, 0.96f, -5.57f, 2.15f)
                lineToRelative(-1.05f, -1.17f)
                lineToRelative(0.95f, -0.95f)
                lineToRelative(-1.41f, -1.42f)
                lineToRelative(-3.25f, 3.25f)
                lineToRelative(1.41f, 1.41f)
                lineToRelative(0.88f, -0.88f)
                lineToRelative(0.98f, 1.09f)
                curveToRelative(-1.82f, 1.96f, -2.94f, 4.58f, -2.94f, 7.46f)
                curveToRelative(0f, 4.69f, 2.96f, 8.7f, 7.11f, 10.28f)
                lineToRelative(1.02f, -1.75f)
                curveToRelative(-3.56f, -1.2f, -6.13f, -4.56f, -6.13f, -8.52f)
                close()
            }
        }.also { _Deadline = it}
