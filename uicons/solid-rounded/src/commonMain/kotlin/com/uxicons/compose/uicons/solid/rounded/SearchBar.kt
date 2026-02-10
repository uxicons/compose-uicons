package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SearchBar: ImageVector? = null

val Icons.Sr.SearchBar: ImageVector
    get() = _SearchBar ?: UXIcon(name = "SearchBar") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(19f, 0f)
                horizontalLineToRelative(-14f)
                curveToRelative(-2.76f, 0f, -5f, 2.24f, -5f, 5f)
                verticalLineToRelative(8f)
                curveToRelative(0f, 2.76f, 2.24f, 5f, 5f, 5f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(-6.85f)
                curveToRelative(0f, -1.64f, 0.93f, -3.09f, 2.42f, -3.77f)
                curveToRelative(1.49f, -0.68f, 3.19f, -0.44f, 4.44f, 0.63f)
                lineToRelative(5.8f, 5.0f)
                curveToRelative(0.12f, 0.1f, 0.23f, 0.22f, 0.34f, 0.34f)
                verticalLineToRelative(-8.35f)
                curveToRelative(0f, -2.76f, -2.24f, -5f, -5f, -5f)
                close()
                moveTo(7f, 13f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                verticalLineToRelative(-8f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                close()
                moveTo(22.36f, 14.53f)
                lineTo(16.55f, 9.52f)
                curveToRelative(-0.65f, -0.56f, -1.53f, -0.68f, -2.3f, -0.33f)
                curveToRelative(-0.77f, 0.35f, -1.25f, 1.1f, -1.25f, 1.96f)
                verticalLineToRelative(7.71f)
                curveToRelative(0f, 0.77f, 0.44f, 1.44f, 1.15f, 1.75f)
                curveToRelative(0.25f, 0.11f, 0.52f, 0.17f, 0.78f, 0.17f)
                curveToRelative(0.47f, 0f, 0.92f, -0.17f, 1.29f, -0.51f)
                lineToRelative(1.47f, -1.34f)
                lineToRelative(2.29f, 4.52f)
                curveToRelative(0.58f, 1.17f, 2.38f, 0.24f, 1.78f, -0.9f)
                lineToRelative(-2.27f, -4.47f)
                lineToRelative(1.81f, -0.19f)
                curveToRelative(0.76f, -0.08f, 1.4f, -0.6f, 1.63f, -1.34f)
                curveToRelative(0.23f, -0.73f, 0f, -1.52f, -0.58f, -2.02f)
                close()
            }
        }.also { _SearchBar = it}
