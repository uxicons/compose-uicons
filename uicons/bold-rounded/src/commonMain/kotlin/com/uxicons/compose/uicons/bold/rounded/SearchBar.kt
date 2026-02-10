package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SearchBar: ImageVector? = null

val Icons.Br.SearchBar: ImageVector
    get() = _SearchBar ?: UXIcon(name = "SearchBar") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(23.45f, 16.48f)
            curveToRelative(0.75f, 0.64f, 0.36f, 1.87f, -0.62f, 1.97f)
            lineToRelative(-2.56f, 0.27f)
            lineToRelative(1.57f, 3.09f)
            curveToRelative(0.38f, 0.74f, 0.08f, 1.64f, -0.66f, 2.02f)
            curveToRelative(-0.72f, 0.37f, -1.64f, 0.09f, -2.02f, -0.66f)
            lineToRelative(-1.55f, -3.05f)
            lineToRelative(-1.73f, 1.58f)
            curveToRelative(-0.72f, 0.66f, -1.89f, 0.15f, -1.89f, -0.83f)
            verticalLineToRelative(-9.46f)
            curveToRelative(0f, -1.21f, 1.42f, -1.86f, 2.33f, -1.07f)
            close()
            moveTo(6f, 6.5f)
            verticalLineToRelative(6f)
            curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
            reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
            verticalLineToRelative(-6f)
            curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
            reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
            close()
            moveTo(18.5f, 0f)
            horizontalLineToRelative(-13f)
            curveToRelative(-3.03f, 0f, -5.5f, 2.47f, -5.5f, 5.5f)
            verticalLineToRelative(8f)
            curveToRelative(0f, 3.03f, 2.47f, 5.5f, 5.5f, 5.5f)
            horizontalLineToRelative(5f)
            curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
            reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
            horizontalLineToRelative(-5f)
            curveToRelative(-1.38f, 0f, -2.5f, -1.12f, -2.5f, -2.5f)
            verticalLineToRelative(-8f)
            curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
            horizontalLineToRelative(13f)
            curveToRelative(1.38f, 0f, 2.5f, 1.12f, 2.5f, 2.5f)
            verticalLineToRelative(5f)
            curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
            reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
            verticalLineToRelative(-5f)
            curveToRelative(0f, -3.03f, -2.47f, -5.5f, -5.5f, -5.5f)
            close()
        }
    }.also { _SearchBar = it }
