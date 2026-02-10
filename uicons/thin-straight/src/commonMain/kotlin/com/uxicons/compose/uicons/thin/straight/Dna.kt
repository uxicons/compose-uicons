package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Dna: ImageVector? = null

val Icons.Ts.Dna: ImageVector
    get() = _Dna ?: UXIcon(name = "Dna") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(14.77f, 13.2f)
                curveToRelative(-0.31f, 0.2f, -0.61f, 0.4f, -0.92f, 0.59f)
                curveToRelative(1.52f, 1.0f, 2.94f, 2.04f, 4.11f, 3.21f)
                lineTo(6.04f, 17f)
                curveToRelative(1.7f, -1.71f, 3.94f, -3.13f, 6.23f, -4.58f)
                curveToRelative(4.79f, -3.02f, 9.73f, -6.15f, 9.73f, -12.42f)
                horizontalLineToRelative(-1f)
                curveToRelative(0f, 0.71f, -0.07f, 1.37f, -0.2f, 2f)
                lineTo(3.2f, 2f)
                curveToRelative(-0.13f, -0.63f, -0.2f, -1.29f, -0.2f, -2f)
                horizontalLineToRelative(-1f)
                curveToRelative(0f, 5.17f, 3.36f, 8.21f, 7.23f, 10.8f)
                curveToRelative(0.31f, -0.2f, 0.61f, -0.4f, 0.92f, -0.59f)
                curveToRelative(-1.52f, -1.0f, -2.94f, -2.04f, -4.11f, -3.21f)
                horizontalLineToRelative(11.93f)
                curveToRelative(-1.7f, 1.71f, -3.94f, 3.13f, -6.23f, 4.58f)
                curveToRelative(-4.79f, 3.02f, -9.73f, 6.15f, -9.73f, 12.42f)
                horizontalLineToRelative(1f)
                curveToRelative(0f, -0.71f, 0.07f, -1.37f, 0.2f, -2f)
                horizontalLineToRelative(17.6f)
                curveToRelative(0.13f, 0.63f, 0.2f, 1.29f, 0.2f, 2f)
                horizontalLineToRelative(1f)
                curveToRelative(0f, -5.17f, -3.36f, -8.21f, -7.23f, -10.8f)
                close()
                moveTo(20.53f, 3f)
                curveToRelative(-0.37f, 1.11f, -0.94f, 2.1f, -1.67f, 3f)
                lineTo(5.14f, 6f)
                curveToRelative(-0.72f, -0.9f, -1.3f, -1.89f, -1.67f, -3f)
                horizontalLineToRelative(17.06f)
                close()
                moveTo(3.47f, 21f)
                curveToRelative(0.37f, -1.11f, 0.94f, -2.1f, 1.67f, -3f)
                horizontalLineToRelative(13.72f)
                curveToRelative(0.72f, 0.9f, 1.3f, 1.89f, 1.67f, 3f)
                lineTo(3.47f, 21f)
                close()
            }
        }.also { _Dna = it}
