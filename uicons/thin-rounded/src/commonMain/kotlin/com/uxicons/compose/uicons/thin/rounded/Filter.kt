package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Filter: ImageVector? = null

val Icons.Tr.Filter: ImageVector
    get() = _Filter ?: UXIcon(name = "Filter") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(19.24f, 0f)
                lineTo(4.76f, 0f)
                curveTo(2.69f, 0f, 1f, 1.69f, 1f, 3.76f)
                curveToRelative(0f, 0.92f, 0.34f, 1.81f, 0.95f, 2.5f)
                lineToRelative(7.05f, 7.93f)
                verticalLineToRelative(6.31f)
                curveToRelative(0f, 0.18f, 0.09f, 0.34f, 0.24f, 0.43f)
                lineToRelative(5f, 3f)
                curveToRelative(0.08f, 0.05f, 0.17f, 0.07f, 0.26f, 0.07f)
                curveToRelative(0.09f, 0f, 0.17f, -0.02f, 0.25f, -0.06f)
                curveToRelative(0.16f, -0.09f, 0.25f, -0.26f, 0.25f, -0.44f)
                verticalLineToRelative(-9.31f)
                lineToRelative(7.05f, -7.93f)
                curveToRelative(0.61f, -0.69f, 0.95f, -1.58f, 0.95f, -2.5f)
                curveToRelative(0f, -2.07f, -1.69f, -3.76f, -3.76f, -3.76f)
                close()
                moveTo(21.3f, 5.59f)
                lineToRelative(-7.18f, 8.07f)
                curveToRelative(-0.08f, 0.09f, -0.13f, 0.21f, -0.13f, 0.33f)
                verticalLineToRelative(8.62f)
                lineToRelative(-4f, -2.4f)
                verticalLineToRelative(-6.22f)
                curveToRelative(0f, -0.12f, -0.04f, -0.24f, -0.13f, -0.33f)
                lineTo(2.7f, 5.59f)
                curveToRelative(-0.45f, -0.51f, -0.7f, -1.16f, -0.7f, -1.83f)
                curveToRelative(0f, -1.52f, 1.24f, -2.76f, 2.76f, -2.76f)
                horizontalLineToRelative(14.48f)
                curveToRelative(1.52f, 0f, 2.76f, 1.24f, 2.76f, 2.76f)
                curveToRelative(0f, 0.68f, -0.25f, 1.33f, -0.7f, 1.83f)
                close()
            }
        }.also { _Filter = it}
