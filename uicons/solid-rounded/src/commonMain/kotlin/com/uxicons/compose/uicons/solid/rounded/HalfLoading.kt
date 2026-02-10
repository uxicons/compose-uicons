package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HalfLoading: ImageVector? = null

val Icons.Sr.HalfLoading: ImageVector
    get() = _HalfLoading ?: UXIcon(name = "HalfLoading") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 4f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                verticalLineToRelative(-2f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                verticalLineToRelative(2f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                close()
                moveTo(13f, 23f)
                verticalLineToRelative(-2f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                reflectiveCurveToRelative(-1f, 0.45f, -1f, 1f)
                verticalLineToRelative(2f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                close()
                moveTo(24f, 12f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                horizontalLineToRelative(-2f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(2f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                close()
                moveTo(17.38f, 4.71f)
                lineTo(18.38f, 2.98f)
                curveToRelative(0.28f, -0.48f, 0.11f, -1.09f, -0.36f, -1.37f)
                curveToRelative(-0.48f, -0.28f, -1.09f, -0.11f, -1.37f, 0.36f)
                lineToRelative(-1.0f, 1.73f)
                curveToRelative(-0.28f, 0.48f, -0.11f, 1.09f, 0.36f, 1.37f)
                curveToRelative(0.47f, 0.27f, 1.09f, 0.12f, 1.37f, -0.36f)
                close()
                moveTo(22.38f, 18.02f)
                curveToRelative(0.28f, -0.48f, 0.11f, -1.09f, -0.36f, -1.37f)
                lineToRelative(-1.73f, -1.0f)
                curveToRelative(-0.48f, -0.28f, -1.09f, -0.11f, -1.37f, 0.36f)
                reflectiveCurveToRelative(-0.11f, 1.09f, 0.36f, 1.37f)
                lineToRelative(1.73f, 1.0f)
                curveToRelative(0.47f, 0.27f, 1.09f, 0.12f, 1.37f, -0.36f)
                close()
                moveTo(18.02f, 22.38f)
                curveToRelative(0.48f, -0.28f, 0.64f, -0.89f, 0.36f, -1.37f)
                lineToRelative(-1.0f, -1.73f)
                curveToRelative(-0.28f, -0.48f, -0.89f, -0.64f, -1.37f, -0.36f)
                curveToRelative(-0.48f, 0.28f, -0.64f, 0.89f, -0.36f, 1.37f)
                lineToRelative(1.0f, 1.73f)
                curveToRelative(0.28f, 0.48f, 0.9f, 0.64f, 1.37f, 0.36f)
                close()
                moveTo(20.29f, 8.35f)
                lineTo(22.02f, 7.35f)
                curveToRelative(0.48f, -0.28f, 0.64f, -0.89f, 0.36f, -1.37f)
                curveToRelative(-0.28f, -0.48f, -0.89f, -0.64f, -1.37f, -0.36f)
                lineToRelative(-1.73f, 1.0f)
                curveToRelative(-0.48f, 0.28f, -0.64f, 0.89f, -0.36f, 1.37f)
                curveToRelative(0.28f, 0.48f, 0.9f, 0.64f, 1.37f, 0.36f)
                close()
            }
        }.also { _HalfLoading = it}
