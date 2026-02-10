package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowUpToDottedLine: ImageVector? = null

val Icons.Tr.ArrowUpToDottedLine: ImageVector
    get() = _ArrowUpToDottedLine ?: UXIcon(name = "ArrowUpToDottedLine") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(3f, 1f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                close()
                moveTo(10f, 2f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                reflectiveCurveToRelative(-1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                close()
                moveTo(14f, 2f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                reflectiveCurveToRelative(-1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                close()
                moveTo(18.85f, 9.64f)
                curveToRelative(0.2f, 0.19f, 0.2f, 0.51f, 0.01f, 0.71f)
                curveToRelative(-0.1f, 0.1f, -0.23f, 0.15f, -0.36f, 0.15f)
                curveToRelative(-0.12f, 0f, -0.25f, -0.05f, -0.35f, -0.14f)
                lineToRelative(-5.09f, -4.91f)
                curveToRelative(-0.16f, -0.16f, -0.36f, -0.28f, -0.57f, -0.35f)
                lineTo(12.5f, 23.58f)
                curveToRelative(0f, 0.28f, -0.22f, 0.5f, -0.5f, 0.5f)
                reflectiveCurveToRelative(-0.5f, -0.22f, -0.5f, -0.5f)
                lineTo(11.5f, 5.09f)
                curveToRelative(-0.21f, 0.07f, -0.4f, 0.18f, -0.56f, 0.34f)
                lineToRelative(-5.09f, 4.92f)
                curveToRelative(-0.2f, 0.19f, -0.52f, 0.19f, -0.71f, -0.01f)
                curveToRelative(-0.19f, -0.2f, -0.19f, -0.52f, 0.01f, -0.71f)
                lineToRelative(5.09f, -4.91f)
                curveToRelative(0.93f, -0.93f, 2.59f, -0.94f, 3.53f, 0.01f)
                lineToRelative(5.08f, 4.91f)
                close()
                moveTo(6f, 2f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                reflectiveCurveToRelative(-1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                close()
                moveTo(18f, 0f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                close()
                moveTo(22f, 0f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                close()
            }
        }.also { _ArrowUpToDottedLine = it}
