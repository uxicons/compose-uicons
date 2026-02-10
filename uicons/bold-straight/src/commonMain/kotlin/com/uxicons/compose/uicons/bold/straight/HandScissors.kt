package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HandScissors: ImageVector? = null

val Icons.Bs.HandScissors: ImageVector
    get() = _HandScissors ?: UXIcon(name = "HandScissors") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24.0f, 22f)
                horizontalLineToRelative(-13.17f)
                lineToRelative(-2.04f, -8.14f)
                lineToRelative(-7.06f, 1.12f)
                curveToRelative(-0.82f, 0.13f, -1.59f, -0.43f, -1.72f, -1.25f)
                curveToRelative(-0.13f, -0.82f, 0.43f, -1.59f, 1.25f, -1.72f)
                lineToRelative(9.77f, -1.56f)
                lineToRelative(2.13f, 8.54f)
                horizontalLineToRelative(7.83f)
                lineToRelative(-0.0f, -9.91f)
                lineToRelative(-3.62f, -3.75f)
                lineToRelative(-4.64f, -0.64f)
                lineToRelative(1.75f, -1.7f)
                curveToRelative(0.66f, -0.65f, 1.52f, -1.0f, 2.45f, -1.0f)
                curveToRelative(0.94f, 0f, 1.81f, 0.36f, 2.51f, 1.06f)
                lineToRelative(4.55f, 4.85f)
                lineToRelative(-0.0f, 14.09f)
                close()
                moveTo(1.42f, 8.21f)
                lineToRelative(14.58f, 2.02f)
                verticalLineToRelative(-3.03f)
                lineTo(1.83f, 5.23f)
                curveToRelative(-0.82f, -0.11f, -1.58f, 0.46f, -1.69f, 1.28f)
                curveToRelative(-0.11f, 0.82f, 0.46f, 1.58f, 1.28f, 1.69f)
                close()
            }
        }.also { _HandScissors = it}
