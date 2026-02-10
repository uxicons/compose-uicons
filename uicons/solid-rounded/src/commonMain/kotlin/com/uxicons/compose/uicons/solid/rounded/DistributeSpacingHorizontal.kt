package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _DistributeSpacingHorizontal: ImageVector? = null

val Icons.Sr.DistributeSpacingHorizontal: ImageVector
    get() = _DistributeSpacingHorizontal ?: UXIcon(name = "DistributeSpacingHorizontal") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21f, 24f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                lineTo(20f, 1f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                lineTo(22f, 23f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                close()
                moveTo(4f, 23f)
                lineTo(4f, 1f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                reflectiveCurveToRelative(-1f, 0.45f, -1f, 1f)
                lineTo(2f, 23f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                close()
                moveTo(17f, 16.5f)
                lineTo(17f, 7.5f)
                curveToRelative(0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                horizontalLineToRelative(-3f)
                curveToRelative(-1.93f, 0f, -3.5f, 1.57f, -3.5f, 3.5f)
                verticalLineToRelative(9f)
                curveToRelative(0f, 1.93f, 1.57f, 3.5f, 3.5f, 3.5f)
                horizontalLineToRelative(3f)
                curveToRelative(1.93f, 0f, 3.5f, -1.57f, 3.5f, -3.5f)
                close()
            }
        }.also { _DistributeSpacingHorizontal = it}
