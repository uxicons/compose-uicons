package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BracketCurlyRight: ImageVector? = null

val Icons.Tr.BracketCurlyRight: ImageVector
    get() = _BracketCurlyRight ?: UXIcon(name = "BracketCurlyRight") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(10.5f, 24f)
                horizontalLineToRelative(-1f)
                curveToRelative(-0.28f, 0f, -0.5f, -0.22f, -0.5f, -0.5f)
                reflectiveCurveToRelative(0.22f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(1f)
                curveToRelative(1.93f, 0f, 3.5f, -1.57f, 3.5f, -3.5f)
                verticalLineToRelative(-2.84f)
                curveToRelative(0f, -1.2f, 0.47f, -2.33f, 1.32f, -3.18f)
                lineToRelative(1.48f, -1.48f)
                lineToRelative(-1.48f, -1.48f)
                curveToRelative(-0.85f, -0.85f, -1.32f, -1.98f, -1.32f, -3.18f)
                verticalLineToRelative(-2.84f)
                curveToRelative(0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                horizontalLineToRelative(-1f)
                curveToRelative(-0.28f, 0f, -0.5f, -0.22f, -0.5f, -0.5f)
                reflectiveCurveToRelative(0.22f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(1f)
                curveToRelative(2.48f, 0f, 4.5f, 2.02f, 4.5f, 4.5f)
                verticalLineToRelative(2.84f)
                curveToRelative(0f, 0.93f, 0.36f, 1.81f, 1.02f, 2.47f)
                lineToRelative(1.83f, 1.83f)
                curveToRelative(0.2f, 0.2f, 0.2f, 0.51f, 0f, 0.71f)
                lineToRelative(-1.83f, 1.83f)
                curveToRelative(-0.66f, 0.66f, -1.02f, 1.54f, -1.02f, 2.47f)
                verticalLineToRelative(2.84f)
                curveToRelative(0f, 2.48f, -2.02f, 4.5f, -4.5f, 4.5f)
                close()
            }
        }.also { _BracketCurlyRight = it}
