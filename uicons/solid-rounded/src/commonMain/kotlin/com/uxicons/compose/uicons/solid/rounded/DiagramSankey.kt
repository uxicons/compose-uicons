package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _DiagramSankey: ImageVector? = null

val Icons.Sr.DiagramSankey: ImageVector
    get() = _DiagramSankey ?: UXIcon(name = "DiagramSankey") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(1f, 7f)
                horizontalLineToRelative(7.34f)
                curveToRelative(1.34f, 0f, 2.59f, -0.52f, 3.54f, -1.46f)
                lineToRelative(2.66f, -2.66f)
                curveToRelative(0.57f, -0.57f, 1.32f, -0.88f, 2.12f, -0.88f)
                horizontalLineToRelative(6.34f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                horizontalLineToRelative(-6.34f)
                curveToRelative(-1.34f, 0f, -2.59f, 0.52f, -3.54f, 1.46f)
                lineToRelative(-2.66f, 2.66f)
                curveToRelative(-0.57f, 0.57f, -1.32f, 0.88f, -2.12f, 0.88f)
                horizontalLineTo(1f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(23f, 22f)
                horizontalLineTo(13.66f)
                curveToRelative(-0.8f, 0f, -1.56f, -0.31f, -2.12f, -0.88f)
                lineToRelative(-4.66f, -4.66f)
                curveToRelative(-0.94f, -0.94f, -2.2f, -1.46f, -3.54f, -1.46f)
                horizontalLineTo(1f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                horizontalLineTo(3.34f)
                curveToRelative(0.8f, 0f, 1.56f, 0.31f, 2.12f, 0.88f)
                lineToRelative(4.66f, 4.66f)
                curveToRelative(0.94f, 0.94f, 2.2f, 1.46f, 3.54f, 1.46f)
                horizontalLineToRelative(9.34f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 11f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                horizontalLineTo(1f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                horizontalLineTo(9.59f)
                lineToRelative(4.54f, 4.54f)
                curveToRelative(0.94f, 0.94f, 2.2f, 1.46f, 3.54f, 1.46f)
                horizontalLineToRelative(5.34f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                horizontalLineToRelative(-5.34f)
                curveToRelative(-0.8f, 0f, -1.56f, -0.31f, -2.12f, -0.88f)
                lineToRelative(-3.12f, -3.12f)
                horizontalLineToRelative(10.59f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                close()
            }
        }.also { _DiagramSankey = it}
