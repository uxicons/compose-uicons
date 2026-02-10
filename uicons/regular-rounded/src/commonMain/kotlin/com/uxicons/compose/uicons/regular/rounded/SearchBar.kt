package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SearchBar: ImageVector? = null

val Icons.Rr.SearchBar: ImageVector
    get() = _SearchBar ?: UXIcon(name = "SearchBar") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(6f, 5f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                verticalLineToRelative(6f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                verticalLineToRelative(-6f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                close()
                moveTo(19f, 0f)
                horizontalLineToRelative(-14f)
                curveToRelative(-2.76f, 0f, -5f, 2.24f, -5f, 5f)
                verticalLineToRelative(8f)
                curveToRelative(0f, 2.76f, 2.24f, 5f, 5f, 5f)
                horizontalLineToRelative(5f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                horizontalLineToRelative(-5f)
                curveToRelative(-1.65f, 0f, -3f, -1.35f, -3f, -3f)
                verticalLineToRelative(-8f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                horizontalLineToRelative(14f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                verticalLineToRelative(7f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                verticalLineToRelative(-7f)
                curveToRelative(0f, -2.76f, -2.24f, -5f, -5f, -5f)
                close()
                moveTo(22.36f, 14.53f)
                curveToRelative(0.58f, 0.5f, 0.81f, 1.29f, 0.58f, 2.02f)
                curveToRelative(-0.23f, 0.73f, -0.87f, 1.25f, -1.63f, 1.34f)
                lineToRelative(-1.81f, 0.19f)
                lineToRelative(2.27f, 4.47f)
                curveToRelative(0.25f, 0.49f, 0.05f, 1.09f, -0.44f, 1.34f)
                curveToRelative(-0.48f, 0.25f, -1.09f, 0.06f, -1.34f, -0.44f)
                lineToRelative(-2.29f, -4.52f)
                lineToRelative(-1.47f, 1.34f)
                curveToRelative(-0.36f, 0.33f, -0.82f, 0.51f, -1.29f, 0.51f)
                curveToRelative(-1.03f, 0.01f, -1.95f, -0.88f, -1.93f, -1.92f)
                verticalLineToRelative(-7.71f)
                curveToRelative(0f, -0.85f, 0.48f, -1.6f, 1.25f, -1.96f)
                curveToRelative(0.77f, -0.35f, 1.65f, -0.23f, 2.3f, 0.33f)
                lineToRelative(5.8f, 5.0f)
                close()
                moveTo(20.91f, 15.92f)
                lineTo(15.25f, 11.04f)
                curveToRelative(-0.1f, -0.09f, -0.25f, -0.02f, -0.25f, 0.11f)
                verticalLineToRelative(7.52f)
                lineToRelative(2.39f, -2.19f)
                curveToRelative(0.16f, -0.14f, 0.36f, -0.23f, 0.57f, -0.26f)
                lineToRelative(2.94f, -0.31f)
                close()
            }
        }.also { _SearchBar = it}
