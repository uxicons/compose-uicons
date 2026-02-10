package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowAltSquareDown: ImageVector? = null

val Icons.Rr.ArrowAltSquareDown: ImageVector
    get() = _ArrowAltSquareDown ?: UXIcon(name = "ArrowAltSquareDown") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19f, 0f)
                lineTo(5f, 0f)
                curveTo(2.24f, 0f, 0f, 2.24f, 0f, 5f)
                verticalLineToRelative(14f)
                curveToRelative(0f, 2.76f, 2.24f, 5f, 5f, 5f)
                horizontalLineToRelative(14f)
                curveToRelative(2.76f, 0f, 5f, -2.24f, 5f, -5f)
                lineTo(24f, 5f)
                curveToRelative(0f, -2.76f, -2.24f, -5f, -5f, -5f)
                close()
                moveTo(22f, 19f)
                curveToRelative(0f, 1.65f, -1.35f, 3f, -3f, 3f)
                lineTo(5f, 22f)
                curveToRelative(-1.65f, 0f, -3f, -1.35f, -3f, -3f)
                lineTo(2f, 5f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                horizontalLineToRelative(14f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                verticalLineToRelative(14f)
                close()
                moveTo(16.91f, 13.35f)
                lineToRelative(-4.36f, 4.42f)
                curveToRelative(-0.3f, 0.31f, -0.8f, 0.31f, -1.1f, 0f)
                lineToRelative(-4.36f, -4.42f)
                curveToRelative(-0.49f, -0.5f, -0.14f, -1.35f, 0.55f, -1.35f)
                horizontalLineToRelative(3.36f)
                lineTo(11f, 7f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(3.36f)
                curveToRelative(0.69f, 0f, 1.04f, 0.85f, 0.55f, 1.35f)
                close()
            }
        }.also { _ArrowAltSquareDown = it}
