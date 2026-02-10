package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Audit: ImageVector? = null

val Icons.Ss.Audit: ImageVector
    get() = _Audit ?: UXIcon(name = "Audit") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(19.41f, 5f)
                horizontalLineToRelative(-4.41f)
                lineTo(15f, 0.59f)
                lineToRelative(4.41f, 4.41f)
                close()
                moveTo(22.56f, 23.98f)
                lineToRelative(-3.09f, -3.09f)
                curveToRelative(-0.98f, 0.7f, -2.18f, 1.11f, -3.47f, 1.11f)
                curveToRelative(-3.31f, 0f, -6f, -2.69f, -6f, -6f)
                reflectiveCurveToRelative(2.69f, -6f, 6f, -6f)
                reflectiveCurveToRelative(6f, 2.69f, 6f, 6f)
                curveToRelative(0f, 1.3f, -0.41f, 2.49f, -1.11f, 3.47f)
                lineToRelative(3.09f, 3.09f)
                lineToRelative(-1.41f, 1.41f)
                close()
                moveTo(16.75f, 18.44f)
                lineToRelative(3.61f, -3.7f)
                lineToRelative(-1.4f, -1.43f)
                lineToRelative(-3.61f, 3.7f)
                lineToRelative(-2.22f, -2.3f)
                lineToRelative(-1.39f, 1.44f)
                lineToRelative(2.18f, 2.27f)
                curveToRelative(0.77f, 0.77f, 2.08f, 0.76f, 2.82f, 0.02f)
                lineToRelative(0.0f, -0.0f)
                close()
                moveTo(8.59f, 19.0f)
                horizontalLineToRelative(-4.59f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(4.07f)
                curveToRelative(-0.04f, -0.33f, -0.07f, -0.66f, -0.07f, -1f)
                reflectiveCurveToRelative(0.03f, -0.67f, 0.07f, -1f)
                horizontalLineToRelative(-4.07f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(4.59f)
                curveToRelative(0.29f, -0.73f, 0.69f, -1.4f, 1.18f, -2f)
                horizontalLineToRelative(-5.76f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(8.14f)
                curveToRelative(1.15f, -0.64f, 2.46f, -1f, 3.86f, -1f)
                curveToRelative(1.46f, 0f, 2.82f, 0.4f, 4f, 1.08f)
                verticalLineToRelative(-2.08f)
                horizontalLineToRelative(-7f)
                lineTo(13f, 0f)
                lineTo(3f, 0f)
                curveTo(1.34f, 0f, 0f, 1.34f, 0f, 3f)
                verticalLineToRelative(21f)
                horizontalLineToRelative(16f)
                curveToRelative(-3.35f, 0f, -6.22f, -2.07f, -7.41f, -5f)
                close()
            }
        }.also { _Audit = it}
