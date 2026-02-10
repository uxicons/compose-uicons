package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ToiletPaperBlank: ImageVector? = null

val Icons.Tr.ToiletPaperBlank: ImageVector
    get() = _ToiletPaperBlank ?: UXIcon(name = "ToiletPaperBlank") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20f, 0f)
                lineTo(7.5f, 0f)
                curveTo(4.98f, 0f, 3f, 3.08f, 3f, 7f)
                verticalLineToRelative(10.5f)
                curveToRelative(0f, 1.03f, -0.62f, 1.94f, -1.57f, 2.32f)
                curveToRelative(-0.87f, 0.35f, -1.43f, 1.14f, -1.43f, 2.02f)
                curveToRelative(0f, 1.19f, 0.97f, 2.15f, 2.15f, 2.15f)
                lineTo(12.5f, 24.0f)
                curveToRelative(2.48f, 0f, 4.5f, -2.02f, 4.5f, -4.5f)
                verticalLineToRelative(-3.5f)
                horizontalLineToRelative(3f)
                curveToRelative(2.24f, 0f, 4f, -3.51f, 4f, -8f)
                reflectiveCurveTo(22.24f, 0f, 20f, 0f)
                close()
                moveTo(16f, 8f)
                verticalLineToRelative(11.5f)
                curveToRelative(0f, 1.93f, -1.57f, 3.5f, -3.5f, 3.5f)
                lineTo(2.15f, 23f)
                curveToRelative(-0.64f, 0f, -1.15f, -0.52f, -1.15f, -1.15f)
                curveToRelative(0f, -0.47f, 0.31f, -0.9f, 0.8f, -1.1f)
                curveToRelative(1.34f, -0.53f, 2.2f, -1.81f, 2.2f, -3.25f)
                lineTo(4f, 7f)
                curveToRelative(0f, -3.25f, 1.6f, -6f, 3.5f, -6f)
                horizontalLineToRelative(10.54f)
                curveToRelative(-1.22f, 1.35f, -2.04f, 3.95f, -2.04f, 7f)
                close()
                moveTo(17f, 15f)
                verticalLineToRelative(-1.66f)
                curveToRelative(0.29f, 0.66f, 0.64f, 1.22f, 1.03f, 1.66f)
                horizontalLineToRelative(-1.03f)
                close()
                moveTo(20f, 15f)
                curveToRelative(-1.42f, 0f, -3f, -2.88f, -3f, -7f)
                reflectiveCurveToRelative(1.58f, -7f, 3f, -7f)
                reflectiveCurveToRelative(3f, 2.88f, 3f, 7f)
                reflectiveCurveToRelative(-1.58f, 7f, -3f, 7f)
                close()
                moveTo(21f, 8f)
                curveToRelative(0f, 0.83f, -0.45f, 1.5f, -1f, 1.5f)
                reflectiveCurveToRelative(-1f, -0.67f, -1f, -1.5f)
                reflectiveCurveToRelative(0.45f, -1.5f, 1f, -1.5f)
                reflectiveCurveToRelative(1f, 0.67f, 1f, 1.5f)
                close()
            }
        }.also { _ToiletPaperBlank = it}
