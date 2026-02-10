package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Butter: ImageVector? = null

val Icons.Rr.Butter: ImageVector
    get() = _Butter ?: UXIcon(name = "Butter") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23f, 16f)
                lineTo(23f, 7f)
                curveToRelative(0f, -2.76f, -2.24f, -5f, -5f, -5f)
                lineTo(6f, 2f)
                curveTo(3.24f, 2f, 1f, 4.24f, 1f, 7f)
                verticalLineToRelative(9f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(0.05f)
                curveToRelative(0.25f, 2.24f, 2.14f, 4f, 4.45f, 4f)
                horizontalLineToRelative(13f)
                curveToRelative(2.31f, 0f, 4.2f, -1.76f, 4.45f, -4f)
                horizontalLineToRelative(0.05f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                close()
                moveTo(21f, 7f)
                verticalLineToRelative(9f)
                horizontalLineToRelative(-3f)
                lineTo(18f, 7f)
                curveToRelative(0f, -1.13f, -0.39f, -2.16f, -1.03f, -3f)
                horizontalLineToRelative(1.03f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                close()
                moveTo(6f, 4f)
                horizontalLineToRelative(7f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                verticalLineToRelative(9f)
                lineTo(3f, 16f)
                lineTo(3f, 7f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                close()
                moveTo(18.5f, 20f)
                lineTo(5.5f, 20f)
                curveToRelative(-1.21f, 0f, -2.22f, -0.86f, -2.45f, -2f)
                horizontalLineToRelative(17.9f)
                curveToRelative(-0.23f, 1.14f, -1.24f, 2f, -2.45f, 2f)
                close()
            }
        }.also { _Butter = it}
