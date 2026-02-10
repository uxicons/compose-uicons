package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BoxDollar: ImageVector? = null

val Icons.Ss.BoxDollar: ImageVector
    get() = _BoxDollar ?: UXIcon(name = "BoxDollar") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(1f, 24f)
                lineTo(23f, 24f)
                lineTo(23f, 10f)
                lineTo(1f, 10f)
                verticalLineToRelative(14f)
                close()
                moveTo(13.48f, 17.76f)
                lineToRelative(-3.29f, -0.55f)
                curveToRelative(-1.27f, -0.21f, -2.19f, -1.3f, -2.19f, -2.59f)
                curveToRelative(0f, -1.45f, 1.18f, -2.62f, 2.62f, -2.62f)
                horizontalLineToRelative(0.38f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(1f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                horizontalLineToRelative(-2f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                horizontalLineToRelative(-2.38f)
                curveToRelative(-0.34f, 0f, -0.62f, 0.28f, -0.62f, 0.62f)
                curveToRelative(0f, 0.31f, 0.22f, 0.57f, 0.52f, 0.62f)
                lineToRelative(3.29f, 0.55f)
                curveToRelative(1.27f, 0.21f, 2.19f, 1.3f, 2.19f, 2.59f)
                curveToRelative(0f, 1.45f, -1.18f, 2.62f, -2.62f, 2.62f)
                horizontalLineToRelative(-0.38f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-1f)
                curveToRelative(-1.65f, 0f, -3f, -1.35f, -3f, -3f)
                horizontalLineToRelative(2f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(2.38f)
                curveToRelative(0.34f, 0f, 0.62f, -0.28f, 0.62f, -0.62f)
                curveToRelative(0f, -0.31f, -0.22f, -0.57f, -0.52f, -0.62f)
                close()
                moveTo(24f, 3f)
                verticalLineToRelative(5f)
                lineTo(0f, 8f)
                lineTo(0f, 3f)
                curveTo(0f, 1.34f, 1.34f, 0f, 3f, 0f)
                lineTo(21f, 0f)
                curveToRelative(1.66f, 0f, 3f, 1.34f, 3f, 3f)
                close()
            }
        }.also { _BoxDollar = it}
