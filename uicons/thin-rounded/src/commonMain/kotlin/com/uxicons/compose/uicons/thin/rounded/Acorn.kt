package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Acorn: ImageVector? = null

val Icons.Tr.Acorn: ImageVector
    get() = _Acorn ?: UXIcon(name = "Acorn") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(17.5f, 2f)
                horizontalLineToRelative(-5f)
                lineTo(12.5f, 0.5f)
                curveToRelative(0f, -0.28f, -0.22f, -0.5f, -0.5f, -0.5f)
                reflectiveCurveToRelative(-0.5f, 0.22f, -0.5f, 0.5f)
                verticalLineToRelative(1.5f)
                lineTo(6.5f, 2f)
                curveTo(3.47f, 2f, 1f, 4.47f, 1f, 7.5f)
                curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
                horizontalLineToRelative(0.5f)
                verticalLineToRelative(5.37f)
                curveToRelative(0f, 4.7f, 4.21f, 7.69f, 6.73f, 9.05f)
                curveToRelative(0.71f, 0.39f, 1.49f, 0.58f, 2.27f, 0.58f)
                reflectiveCurveToRelative(1.56f, -0.19f, 2.27f, -0.58f)
                curveToRelative(2.51f, -1.36f, 6.73f, -4.35f, 6.73f, -9.05f)
                verticalLineToRelative(-5.37f)
                horizontalLineToRelative(0.5f)
                curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
                curveToRelative(0f, -3.03f, -2.47f, -5.5f, -5.5f, -5.5f)
                close()
                moveTo(20f, 14.37f)
                curveToRelative(0f, 4.19f, -3.89f, 6.92f, -6.2f, 8.17f)
                curveToRelative(-1.13f, 0.61f, -2.47f, 0.61f, -3.6f, 0f)
                curveToRelative(-2.32f, -1.26f, -6.2f, -3.99f, -6.2f, -8.17f)
                verticalLineToRelative(-5.37f)
                lineTo(20f, 9f)
                verticalLineToRelative(5.37f)
                close()
                moveTo(21.5f, 8f)
                lineTo(2.5f, 8f)
                curveToRelative(-0.28f, 0f, -0.5f, -0.22f, -0.5f, -0.5f)
                curveToRelative(0f, -2.48f, 2.02f, -4.5f, 4.5f, -4.5f)
                horizontalLineToRelative(11f)
                curveToRelative(2.48f, 0f, 4.5f, 2.02f, 4.5f, 4.5f)
                curveToRelative(0f, 0.28f, -0.22f, 0.5f, -0.5f, 0.5f)
                close()
            }
        }.also { _Acorn = it}
