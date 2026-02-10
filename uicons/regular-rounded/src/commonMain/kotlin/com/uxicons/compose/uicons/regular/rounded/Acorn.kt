package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Acorn: ImageVector? = null

val Icons.Rr.Acorn: ImageVector
    get() = _Acorn ?: UXIcon(name = "Acorn") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(17f, 2f)
                horizontalLineToRelative(-4f)
                lineTo(13f, 1f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                reflectiveCurveToRelative(-1f, 0.45f, -1f, 1f)
                verticalLineToRelative(1f)
                lineTo(7f, 2f)
                curveTo(3.69f, 2f, 1f, 4.69f, 1f, 8f)
                curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                verticalLineToRelative(4.41f)
                curveToRelative(0f, 4.7f, 4.14f, 7.65f, 6.61f, 8.98f)
                curveToRelative(0.75f, 0.41f, 1.57f, 0.61f, 2.39f, 0.61f)
                reflectiveCurveToRelative(1.64f, -0.2f, 2.39f, -0.61f)
                curveToRelative(2.47f, -1.34f, 6.61f, -4.28f, 6.61f, -8.98f)
                verticalLineToRelative(-4.41f)
                curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                curveToRelative(0f, -3.31f, -2.69f, -6f, -6f, -6f)
                close()
                moveTo(19f, 14.41f)
                curveToRelative(0f, 3.67f, -3.48f, 6.1f, -5.56f, 7.23f)
                curveToRelative(-0.9f, 0.49f, -1.98f, 0.49f, -2.88f, 0f)
                curveToRelative(-2.08f, -1.12f, -5.56f, -3.56f, -5.56f, -7.23f)
                verticalLineToRelative(-4.41f)
                horizontalLineToRelative(14f)
                verticalLineToRelative(4.41f)
                close()
                moveTo(3f, 8f)
                curveToRelative(0f, -2.21f, 1.79f, -4f, 4f, -4f)
                horizontalLineToRelative(10f)
                curveToRelative(2.21f, 0f, 4f, 1.79f, 4f, 4f)
                lineTo(3f, 8f)
                close()
            }
        }.also { _Acorn = it}
