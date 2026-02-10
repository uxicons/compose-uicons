package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowUpToDottedLine: ImageVector? = null

val Icons.Rr.ArrowUpToDottedLine: ImageVector
    get() = _ArrowUpToDottedLine ?: UXIcon(name = "ArrowUpToDottedLine") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(5f, 1f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                close()
                moveTo(14f, 2f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                reflectiveCurveToRelative(-1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                close()
                moveTo(10f, 2f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                reflectiveCurveToRelative(-1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                close()
                moveTo(2f, 0f)
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
                moveTo(18f, 0f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                close()
                moveTo(14.12f, 4.88f)
                curveToRelative(-1.13f, -1.13f, -3.12f, -1.12f, -4.23f, -0.01f)
                lineToRelative(-4.59f, 4.41f)
                curveToRelative(-0.4f, 0.38f, -0.41f, 1.02f, -0.03f, 1.41f)
                curveToRelative(0.39f, 0.4f, 1.02f, 0.41f, 1.41f, 0.03f)
                lineToRelative(4.31f, -4.14f)
                lineTo(11f, 23f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                lineTo(13f, 6.58f)
                lineToRelative(4.31f, 4.14f)
                curveToRelative(0.19f, 0.19f, 0.44f, 0.28f, 0.69f, 0.28f)
                curveToRelative(0.26f, 0f, 0.52f, -0.1f, 0.72f, -0.31f)
                curveToRelative(0.38f, -0.4f, 0.37f, -1.03f, -0.03f, -1.41f)
                lineToRelative(-4.57f, -4.4f)
                close()
            }
        }.also { _ArrowUpToDottedLine = it}
