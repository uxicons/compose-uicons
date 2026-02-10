package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TwoSwords: ImageVector? = null

val Icons.Ss.TwoSwords: ImageVector
    get() = _TwoSwords ?: UXIcon(name = "TwoSwords") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 15f)
                curveToRelative(-0.03f, 0f, -2.81f, 0.2f, -5.33f, 2.25f)
                lineToRelative(4.54f, 4.54f)
                lineToRelative(-1.41f, 1.41f)
                lineToRelative(-4.54f, -4.54f)
                curveToRelative(-2.05f, 2.52f, -2.26f, 5.31f, -2.26f, 5.34f)
                horizontalLineToRelative(-2f)
                curveToRelative(0f, -0.63f, 0.33f, -2.85f, 1.7f, -5.15f)
                lineToRelative(-1.28f, -1.28f)
                lineToRelative(4.17f, -4.17f)
                lineToRelative(1.28f, 1.28f)
                curveToRelative(2.29f, -1.36f, 4.51f, -1.69f, 5.14f, -1.69f)
                verticalLineToRelative(2f)
                close()
                moveTo(22.62f, 5.54f)
                lineToRelative(1.35f, -4.11f)
                curveToRelative(0.18f, -0.84f, -0.56f, -1.59f, -1.41f, -1.41f)
                lineToRelative(-4.11f, 1.35f)
                lineTo(5.14f, 14.69f)
                curveToRelative(-2.29f, -1.36f, -4.51f, -1.69f, -5.14f, -1.69f)
                verticalLineToRelative(2f)
                curveToRelative(0.03f, 0f, 2.81f, 0.2f, 5.33f, 2.25f)
                lineTo(0.79f, 21.79f)
                lineToRelative(1.41f, 1.41f)
                lineToRelative(4.54f, -4.54f)
                curveToRelative(2.05f, 2.52f, 2.26f, 5.31f, 2.26f, 5.34f)
                horizontalLineToRelative(2f)
                curveToRelative(0f, -0.63f, -0.33f, -2.85f, -1.7f, -5.15f)
                lineTo(22.62f, 5.54f)
                close()
                moveTo(1.38f, 5.54f)
                lineToRelative(5.04f, 5.04f)
                lineToRelative(4.17f, -4.17f)
                lineTo(5.54f, 1.38f)
                lineTo(1.43f, 0.03f)
                curveTo(0.59f, -0.16f, -0.16f, 0.59f, 0.03f, 1.43f)
                lineTo(1.38f, 5.54f)
                close()
            }
        }.also { _TwoSwords = it}
