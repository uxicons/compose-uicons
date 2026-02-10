package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HalfLoading: ImageVector? = null

val Icons.Rr.HalfLoading: ImageVector
    get() = _HalfLoading ?: UXIcon(name = "HalfLoading") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(13f, 1f)
                verticalLineToRelative(2f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                verticalLineToRelative(-2f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                close()
                moveTo(12f, 20f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                verticalLineToRelative(2f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                verticalLineToRelative(-2f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                close()
                moveTo(23f, 11f)
                horizontalLineToRelative(-2f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(2f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                close()
                moveTo(18.02f, 1.62f)
                curveToRelative(-0.48f, -0.28f, -1.09f, -0.11f, -1.37f, 0.36f)
                lineToRelative(-1.0f, 1.73f)
                curveToRelative(-0.28f, 0.48f, -0.11f, 1.09f, 0.36f, 1.37f)
                curveToRelative(0.16f, 0.09f, 0.33f, 0.14f, 0.5f, 0.14f)
                curveToRelative(0.34f, 0f, 0.68f, -0.18f, 0.87f, -0.5f)
                lineToRelative(1.0f, -1.73f)
                curveToRelative(0.28f, -0.48f, 0.11f, -1.09f, -0.36f, -1.37f)
                close()
                moveTo(22.02f, 16.65f)
                lineTo(20.29f, 15.65f)
                curveToRelative(-0.48f, -0.28f, -1.09f, -0.11f, -1.37f, 0.36f)
                reflectiveCurveToRelative(-0.11f, 1.09f, 0.36f, 1.37f)
                lineToRelative(1.73f, 1.0f)
                curveToRelative(0.47f, 0.27f, 1.09f, 0.12f, 1.37f, -0.36f)
                curveToRelative(0.28f, -0.48f, 0.11f, -1.09f, -0.36f, -1.37f)
                close()
                moveTo(17.38f, 19.28f)
                curveToRelative(-0.28f, -0.48f, -0.89f, -0.64f, -1.37f, -0.36f)
                curveToRelative(-0.48f, 0.28f, -0.64f, 0.89f, -0.36f, 1.37f)
                lineToRelative(1.0f, 1.73f)
                curveToRelative(0.28f, 0.48f, 0.9f, 0.64f, 1.37f, 0.36f)
                curveToRelative(0.48f, -0.28f, 0.64f, -0.89f, 0.36f, -1.37f)
                close()
                moveTo(19.79f, 8.49f)
                curveToRelative(0.17f, 0f, 0.34f, -0.04f, 0.5f, -0.14f)
                lineToRelative(1.73f, -1.0f)
                curveToRelative(0.48f, -0.28f, 0.64f, -0.89f, 0.36f, -1.37f)
                curveToRelative(-0.28f, -0.48f, -0.89f, -0.64f, -1.37f, -0.36f)
                lineToRelative(-1.73f, 1.0f)
                curveToRelative(-0.48f, 0.28f, -0.64f, 0.89f, -0.36f, 1.37f)
                curveToRelative(0.19f, 0.32f, 0.52f, 0.5f, 0.87f, 0.5f)
                close()
            }
        }.also { _HalfLoading = it}
