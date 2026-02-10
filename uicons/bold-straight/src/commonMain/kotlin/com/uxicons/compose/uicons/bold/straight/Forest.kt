package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Forest: ImageVector? = null

val Icons.Bs.Forest: ImageVector
    get() = _Forest ?: UXIcon(name = "Forest") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 13f)
                curveToRelative(0f, -2.37f, -0.9f, -4.23f, -2.29f, -5.45f)
                curveTo(20.68f, 3.12f, 16.85f, 0f, 12f, 0f)
                curveToRelative(-3.2f, 0f, -5.96f, 1.36f, -7.77f, 3.56f)
                curveTo(1.84f, 4.59f, 0f, 7.1f, 0f, 11.5f)
                curveToRelative(0f, 5.13f, 2.14f, 7.5f, 5f, 8.08f)
                verticalLineToRelative(4.42f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-4.44f)
                curveToRelative(0.17f, -0.04f, 0.34f, -0.07f, 0.5f, -0.12f)
                curveToRelative(0.63f, 0.21f, 1.3f, 0.36f, 2.0f, 0.45f)
                verticalLineToRelative(4.1f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-4.1f)
                curveToRelative(0.57f, -0.07f, 1.12f, -0.17f, 1.64f, -0.33f)
                curveToRelative(0.28f, 0.1f, 0.56f, 0.17f, 0.86f, 0.24f)
                verticalLineToRelative(4.19f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-4.17f)
                curveToRelative(2.86f, -0.65f, 5f, -3.14f, 5f, -6.83f)
                close()
                moveTo(19f, 10f)
                curveToRelative(0f, 3.73f, -2.11f, 6.3f, -5.5f, 6.88f)
                verticalLineToRelative(-3.25f)
                lineToRelative(3.56f, -3.56f)
                lineToRelative(-2.12f, -2.12f)
                lineToRelative(-1.44f, 1.44f)
                verticalLineToRelative(-2.38f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(2.38f)
                lineToRelative(-1.44f, -1.44f)
                lineToRelative(-2.12f, 2.12f)
                lineToRelative(3.56f, 3.56f)
                verticalLineToRelative(3.25f)
                curveToRelative(-3.39f, -0.58f, -5.5f, -3.15f, -5.5f, -6.88f)
                curveToRelative(0f, -3.99f, 3.01f, -7f, 7f, -7f)
                reflectiveCurveToRelative(7f, 3.01f, 7f, 7f)
                close()
            }
        }.also { _Forest = it}
