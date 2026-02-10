package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Trademark: ImageVector? = null

val Icons.Rr.Trademark: ImageVector
    get() = _Trademark ?: UXIcon(name = "Trademark") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(10f, 6f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(11f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                lineTo(4f, 7f)
                lineTo(1f, 7f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                lineTo(9f, 5f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                close()
                moveTo(21.94f, 5f)
                curveToRelative(-0.77f, 0f, -1.47f, 0.42f, -1.82f, 1.09f)
                lineToRelative(-2.61f, 4.81f)
                lineToRelative(-2.61f, -4.8f)
                curveToRelative(-0.36f, -0.68f, -1.06f, -1.1f, -1.83f, -1.1f)
                curveToRelative(-1.14f, 0f, -2.06f, 0.93f, -2.06f, 2.06f)
                verticalLineToRelative(10.94f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                lineTo(13.01f, 7.06f)
                lineToRelative(0.13f, -0.02f)
                lineToRelative(3.49f, 6.43f)
                curveToRelative(0.35f, 0.64f, 1.41f, 0.64f, 1.76f, 0f)
                lineToRelative(3.49f, -6.43f)
                reflectiveCurveToRelative(0f, 0f, 0f, 0f)
                curveToRelative(0.02f, 0f, 0.13f, 0.03f, 0.13f, 0.02f)
                verticalLineToRelative(10.94f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                lineTo(24.01f, 7.06f)
                curveToRelative(0f, -1.14f, -0.93f, -2.06f, -2.06f, -2.06f)
                close()
            }
        }.also { _Trademark = it}
