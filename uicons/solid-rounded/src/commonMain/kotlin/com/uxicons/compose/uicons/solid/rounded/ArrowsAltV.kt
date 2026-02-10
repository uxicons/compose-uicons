package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowsAltV: ImageVector? = null

val Icons.Sr.ArrowsAltV: ImageVector
    get() = _ArrowsAltV ?: UXIcon(name = "ArrowsAltV") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(16.36f, 18f)
                horizontalLineToRelative(-3.36f)
                verticalLineTo(6f)
                horizontalLineToRelative(3.36f)
                curveToRelative(0.69f, 0f, 1.04f, -0.85f, 0.55f, -1.35f)
                lineTo(12.55f, 0.23f)
                curveToRelative(-0.3f, -0.31f, -0.8f, -0.31f, -1.1f, 0f)
                lineTo(7.09f, 4.65f)
                curveToRelative(-0.49f, 0.5f, -0.14f, 1.35f, 0.55f, 1.35f)
                horizontalLineToRelative(3.36f)
                verticalLineToRelative(12f)
                horizontalLineToRelative(-3.36f)
                curveToRelative(-0.69f, 0f, -1.04f, 0.85f, -0.55f, 1.35f)
                lineToRelative(4.36f, 4.42f)
                curveToRelative(0.3f, 0.31f, 0.8f, 0.31f, 1.1f, 0f)
                lineToRelative(4.36f, -4.42f)
                curveToRelative(0.49f, -0.5f, 0.14f, -1.35f, -0.55f, -1.35f)
                close()
            }
        }.also { _ArrowsAltV = it}
