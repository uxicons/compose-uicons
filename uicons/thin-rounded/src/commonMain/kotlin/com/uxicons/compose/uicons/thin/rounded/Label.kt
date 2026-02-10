package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Label: ImageVector? = null

val Icons.Tr.Label: ImageVector
    get() = _Label ?: UXIcon(name = "Label") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(20.38f, 4.69f)
                lineTo(13.68f, 0.43f)
                curveToRelative(-1.05f, -0.58f, -2.31f, -0.58f, -3.36f, 0f)
                lineTo(3.62f, 4.69f)
                curveToRelative(-1.01f, 0.65f, -1.62f, 1.75f, -1.62f, 2.95f)
                verticalLineToRelative(11.85f)
                curveToRelative(0f, 2.48f, 2.02f, 4.5f, 4.5f, 4.5f)
                horizontalLineToRelative(11f)
                curveToRelative(2.48f, 0f, 4.5f, -2.02f, 4.5f, -4.5f)
                lineTo(22f, 7.65f)
                curveToRelative(0f, -1.2f, -0.6f, -2.31f, -1.62f, -2.95f)
                close()
                moveTo(21f, 19.5f)
                curveToRelative(0f, 1.93f, -1.57f, 3.5f, -3.5f, 3.5f)
                lineTo(6.5f, 23f)
                curveToRelative(-1.93f, 0f, -3.5f, -1.57f, -3.5f, -3.5f)
                lineTo(3f, 7.65f)
                curveToRelative(0f, -0.86f, 0.43f, -1.65f, 1.16f, -2.11f)
                lineTo(10.81f, 1.3f)
                curveToRelative(0.75f, -0.4f, 1.64f, -0.4f, 2.36f, -0.01f)
                lineToRelative(6.67f, 4.25f)
                curveToRelative(0.72f, 0.46f, 1.16f, 1.25f, 1.16f, 2.11f)
                verticalLineToRelative(11.85f)
                close()
                moveTo(12f, 5f)
                curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                reflectiveCurveToRelative(0.9f, 2f, 2f, 2f)
                reflectiveCurveToRelative(2f, -0.9f, 2f, -2f)
                reflectiveCurveToRelative(-0.9f, -2f, -2f, -2f)
                close()
                moveTo(12f, 8f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                close()
            }
        }.also { _Label = it}
