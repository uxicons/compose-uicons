package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Butter: ImageVector? = null

val Icons.Tr.Butter: ImageVector
    get() = _Butter ?: UXIcon(name = "Butter") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23.5f, 16f)
                horizontalLineToRelative(-0.5f)
                lineTo(23f, 6.5f)
                curveToRelative(0f, -2.48f, -2.02f, -4.5f, -4.5f, -4.5f)
                lineTo(5.5f, 2f)
                curveTo(3.02f, 2f, 1f, 4.02f, 1f, 6.5f)
                verticalLineToRelative(9.5f)
                horizontalLineToRelative(-0.5f)
                curveToRelative(-0.28f, 0f, -0.5f, 0.22f, -0.5f, 0.5f)
                reflectiveCurveToRelative(0.22f, 0.5f, 0.5f, 0.5f)
                horizontalLineToRelative(0.5f)
                verticalLineToRelative(0.5f)
                curveToRelative(0f, 1.93f, 1.57f, 3.5f, 3.5f, 3.5f)
                horizontalLineToRelative(15f)
                curveToRelative(1.93f, 0f, 3.5f, -1.57f, 3.5f, -3.5f)
                verticalLineToRelative(-0.5f)
                horizontalLineToRelative(0.5f)
                curveToRelative(0.28f, 0f, 0.5f, -0.22f, 0.5f, -0.5f)
                reflectiveCurveToRelative(-0.22f, -0.5f, -0.5f, -0.5f)
                close()
                moveTo(18.5f, 3f)
                curveToRelative(1.93f, 0f, 3.5f, 1.57f, 3.5f, 3.5f)
                verticalLineToRelative(9.5f)
                horizontalLineToRelative(-3f)
                lineTo(19f, 6.5f)
                curveToRelative(0f, -1.42f, -0.68f, -2.67f, -1.71f, -3.5f)
                horizontalLineToRelative(1.21f)
                close()
                moveTo(5.5f, 3f)
                horizontalLineToRelative(9f)
                curveToRelative(1.93f, 0f, 3.5f, 1.57f, 3.5f, 3.5f)
                verticalLineToRelative(9.5f)
                lineTo(2f, 16f)
                lineTo(2f, 6.5f)
                curveToRelative(0f, -1.93f, 1.57f, -3.5f, 3.5f, -3.5f)
                close()
                moveTo(19.5f, 20f)
                lineTo(4.5f, 20f)
                curveToRelative(-1.38f, 0f, -2.5f, -1.12f, -2.5f, -2.5f)
                verticalLineToRelative(-0.5f)
                horizontalLineToRelative(20f)
                verticalLineToRelative(0.5f)
                curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
                close()
            }
        }.also { _Butter = it}
