package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Rr7: ImageVector? = null

val Icons.Rr.Rr7: ImageVector
    get() = _Rr7 ?: UXIcon(name = "Rr7") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(8.0f, 24f)
                curveToRelative(-0.16f, 0f, -0.33f, -0.04f, -0.48f, -0.12f)
                curveToRelative(-0.48f, -0.27f, -0.66f, -0.87f, -0.4f, -1.36f)
                lineTo(17.96f, 2.69f)
                curveToRelative(0.1f, -0.19f, 0.01f, -0.38f, -0.04f, -0.46f)
                curveToRelative(-0.04f, -0.07f, -0.17f, -0.24f, -0.42f, -0.24f)
                horizontalLineTo(5f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(12.5f)
                curveToRelative(0.87f, 0f, 1.67f, 0.44f, 2.13f, 1.19f)
                curveToRelative(0.46f, 0.74f, 0.5f, 1.65f, 0.11f, 2.43f)
                lineTo(8.88f, 23.48f)
                curveToRelative(-0.18f, 0.33f, -0.52f, 0.52f, -0.88f, 0.52f)
                close()
            }
        }.also { _Rr7 = it}
