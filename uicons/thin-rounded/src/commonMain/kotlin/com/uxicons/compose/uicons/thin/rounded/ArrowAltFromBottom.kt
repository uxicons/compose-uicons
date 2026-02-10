package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowAltFromBottom: ImageVector? = null

val Icons.Tr.ArrowAltFromBottom: ImageVector
    get() = _ArrowAltFromBottom ?: UXIcon(name = "ArrowAltFromBottom") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20.5f, 23f)
                horizontalLineTo(12.5f)
                verticalLineTo(7f)
                horizontalLineToRelative(3.86f)
                curveToRelative(0.52f, 0f, 0.98f, -0.3f, 1.18f, -0.79f)
                curveToRelative(0.2f, -0.48f, 0.1f, -1.04f, -0.27f, -1.41f)
                lineTo(12.91f, 0.38f)
                curveToRelative(-0.48f, -0.49f, -1.33f, -0.49f, -1.82f, 0f)
                lineTo(6.73f, 4.8f)
                curveToRelative(-0.37f, 0.37f, -0.47f, 0.93f, -0.27f, 1.41f)
                curveToRelative(0.2f, 0.49f, 0.66f, 0.79f, 1.18f, 0.79f)
                horizontalLineToRelative(3.86f)
                verticalLineTo(23f)
                horizontalLineTo(3.5f)
                curveToRelative(-0.28f, 0f, -0.5f, 0.22f, -0.5f, 0.5f)
                reflectiveCurveToRelative(0.22f, 0.5f, 0.5f, 0.5f)
                horizontalLineTo(20.5f)
                curveToRelative(0.28f, 0f, 0.5f, -0.22f, 0.5f, -0.5f)
                reflectiveCurveToRelative(-0.22f, -0.5f, -0.5f, -0.5f)
                close()
                moveTo(7.38f, 5.83f)
                curveToRelative(-0.02f, -0.06f, -0.06f, -0.2f, 0.06f, -0.32f)
                lineTo(11.8f, 1.08f)
                curveToRelative(0.05f, -0.05f, 0.12f, -0.08f, 0.2f, -0.08f)
                reflectiveCurveToRelative(0.14f, 0.03f, 0.2f, 0.08f)
                lineToRelative(4.36f, 4.42f)
                curveToRelative(0.12f, 0.13f, 0.08f, 0.27f, 0.06f, 0.32f)
                curveToRelative(-0.02f, 0.05f, -0.09f, 0.17f, -0.26f, 0.17f)
                horizontalLineTo(7.64f)
                curveToRelative(-0.17f, 0f, -0.23f, -0.12f, -0.26f, -0.17f)
                close()
            }
        }.also { _ArrowAltFromBottom = it}
