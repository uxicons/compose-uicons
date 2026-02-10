package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowLeftFromLine: ImageVector? = null

val Icons.Tr.ArrowLeftFromLine: ImageVector
    get() = _ArrowLeftFromLine ?: UXIcon(name = "ArrowLeftFromLine") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 0.5f)
                lineTo(24f, 23.5f)
                curveToRelative(0f, 0.28f, -0.22f, 0.5f, -0.5f, 0.5f)
                reflectiveCurveToRelative(-0.5f, -0.22f, -0.5f, -0.5f)
                lineTo(23f, 0.5f)
                curveToRelative(0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f)
                reflectiveCurveToRelative(0.5f, 0.22f, 0.5f, 0.5f)
                close()
                moveTo(20.5f, 11.5f)
                lineTo(1.09f, 11.5f)
                curveToRelative(0.07f, -0.21f, 0.2f, -0.4f, 0.36f, -0.57f)
                lineTo(5.86f, 6.35f)
                curveToRelative(0.19f, -0.2f, 0.19f, -0.52f, -0.01f, -0.71f)
                curveToRelative(-0.2f, -0.19f, -0.51f, -0.19f, -0.71f, 0.01f)
                lineTo(0.73f, 10.23f)
                curveToRelative(-0.47f, 0.47f, -0.73f, 1.1f, -0.73f, 1.77f)
                reflectiveCurveToRelative(0.26f, 1.3f, 0.73f, 1.76f)
                lineToRelative(4.41f, 4.59f)
                curveToRelative(0.1f, 0.1f, 0.23f, 0.15f, 0.36f, 0.15f)
                reflectiveCurveToRelative(0.25f, -0.05f, 0.35f, -0.14f)
                curveToRelative(0.2f, -0.19f, 0.21f, -0.51f, 0.01f, -0.71f)
                lineTo(1.44f, 13.06f)
                curveToRelative(-0.16f, -0.16f, -0.28f, -0.35f, -0.35f, -0.56f)
                curveToRelative(0f, 0f, 0f, 0f, 0f, 0f)
                lineTo(20.5f, 12.5f)
                curveToRelative(0.28f, 0f, 0.5f, -0.22f, 0.5f, -0.5f)
                reflectiveCurveToRelative(-0.22f, -0.5f, -0.5f, -0.5f)
                close()
            }
        }.also { _ArrowLeftFromLine = it}
