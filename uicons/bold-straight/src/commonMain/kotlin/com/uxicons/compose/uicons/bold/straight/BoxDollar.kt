package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BoxDollar: ImageVector? = null

val Icons.Bs.BoxDollar: ImageVector
    get() = _BoxDollar ?: UXIcon(name = "BoxDollar") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 3.5f)
                curveToRelative(0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                lineTo(3.5f, 0f)
                curveTo(1.57f, 0f, 0f, 1.57f, 0f, 3.5f)
                verticalLineToRelative(6.5f)
                lineTo(1f, 10f)
                verticalLineToRelative(14f)
                lineTo(23f, 24f)
                lineTo(23f, 10f)
                horizontalLineToRelative(1f)
                lineTo(24f, 3.5f)
                close()
                moveTo(3f, 3.5f)
                curveToRelative(0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f)
                lineTo(20.5f, 3f)
                curveToRelative(0.28f, 0f, 0.5f, 0.22f, 0.5f, 0.5f)
                verticalLineToRelative(3.5f)
                lineTo(3f, 7f)
                lineTo(3f, 3.5f)
                close()
                moveTo(4f, 21f)
                lineTo(4f, 10f)
                horizontalLineToRelative(6.98f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-0.38f)
                curveToRelative(-1.45f, 0f, -2.62f, 1.18f, -2.62f, 2.62f)
                curveToRelative(0f, 1.29f, 0.92f, 2.38f, 2.19f, 2.59f)
                lineToRelative(3.28f, 0.55f)
                curveToRelative(0.3f, 0.05f, 0.52f, 0.31f, 0.52f, 0.62f)
                curveToRelative(0f, 0.34f, -0.28f, 0.62f, -0.62f, 0.62f)
                horizontalLineToRelative(-2.38f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                horizontalLineToRelative(-2f)
                curveToRelative(0f, 1.65f, 1.35f, 3f, 3f, 3f)
                verticalLineToRelative(1f)
                lineTo(4f, 21f)
                close()
                moveTo(20f, 21f)
                horizontalLineToRelative(-7.02f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(0.38f)
                curveToRelative(1.45f, 0f, 2.62f, -1.18f, 2.62f, -2.62f)
                curveToRelative(0f, -1.29f, -0.92f, -2.38f, -2.19f, -2.59f)
                lineToRelative(-3.28f, -0.55f)
                curveToRelative(-0.3f, -0.05f, -0.52f, -0.31f, -0.52f, -0.62f)
                curveToRelative(0f, -0.34f, 0.28f, -0.62f, 0.62f, -0.62f)
                horizontalLineToRelative(2.38f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                horizontalLineToRelative(2f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(7.02f)
                verticalLineToRelative(11f)
                close()
            }
        }.also { _BoxDollar = it}
