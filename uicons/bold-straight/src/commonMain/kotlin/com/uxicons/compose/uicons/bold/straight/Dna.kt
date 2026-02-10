package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Dna: ImageVector? = null

val Icons.Bs.Dna: ImageVector
    get() = _Dna ?: UXIcon(name = "Dna") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(16.55f, 13.22f)
                curveToRelative(-0.9f, 0.61f, -2.7f, 1.75f, -2.71f, 1.76f)
                curveToRelative(0.49f, 0.33f, 0.97f, 0.67f, 1.43f, 1.02f)
                horizontalLineToRelative(-6.54f)
                curveToRelative(1.25f, -0.95f, 2.65f, -1.83f, 4.07f, -2.73f)
                curveToRelative(4.78f, -3.02f, 10.2f, -6.44f, 10.2f, -13.27f)
                lineTo(1f, -0.0f)
                curveToRelative(0f, 5.05f, 2.97f, 8.24f, 6.45f, 10.78f)
                curveToRelative(0.9f, -0.61f, 1.81f, -1.19f, 2.68f, -1.74f)
                curveToRelative(0.01f, -0.01f, 0.02f, -0.01f, 0.03f, -0.02f)
                curveToRelative(-0.49f, -0.33f, -0.97f, -0.67f, -1.43f, -1.02f)
                horizontalLineToRelative(6.54f)
                curveToRelative(-1.25f, 0.95f, -2.65f, 1.83f, -4.07f, 2.73f)
                curveTo(6.42f, 13.75f, 1f, 17.17f, 1f, 24f)
                horizontalLineToRelative(22f)
                curveToRelative(0f, -5.05f, -2.97f, -8.24f, -6.45f, -10.78f)
                close()
                moveTo(4.55f, 3f)
                horizontalLineToRelative(14.91f)
                curveToRelative(-0.28f, 0.72f, -0.65f, 1.38f, -1.11f, 2f)
                lineTo(5.65f, 5f)
                curveToRelative(-0.45f, -0.62f, -0.83f, -1.28f, -1.11f, -2f)
                close()
                moveTo(4.55f, 21f)
                curveToRelative(0.28f, -0.72f, 0.65f, -1.38f, 1.11f, -2f)
                horizontalLineToRelative(12.69f)
                curveToRelative(0.45f, 0.62f, 0.83f, 1.28f, 1.11f, 2f)
                lineTo(4.55f, 21f)
                close()
            }
        }.also { _Dna = it}
