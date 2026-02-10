package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Butter: ImageVector? = null

val Icons.Sr.Butter: ImageVector
    get() = _Butter ?: UXIcon(name = "Butter") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(17f, 15f)
                lineTo(1f, 15f)
                lineTo(1f, 6.5f)
                curveToRelative(0f, -2.48f, 2.02f, -4.5f, 4.5f, -4.5f)
                horizontalLineToRelative(7.5f)
                curveToRelative(2.21f, 0f, 4f, 1.79f, 4f, 4f)
                verticalLineToRelative(9f)
                close()
                moveTo(18.5f, 2f)
                horizontalLineToRelative(-1.04f)
                curveToRelative(0.95f, 1.06f, 1.54f, 2.46f, 1.54f, 4f)
                verticalLineToRelative(9f)
                horizontalLineToRelative(4f)
                lineTo(23f, 6.5f)
                curveToRelative(0f, -2.48f, -2.02f, -4.5f, -4.5f, -4.5f)
                close()
                moveTo(23f, 17f)
                lineTo(1f, 17f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(0.28f)
                curveToRelative(0.63f, 1.76f, 2.31f, 3f, 4.22f, 3f)
                horizontalLineToRelative(13f)
                curveToRelative(1.91f, 0f, 3.6f, -1.24f, 4.22f, -3f)
                horizontalLineToRelative(0.28f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                close()
            }
        }.also { _Butter = it}
