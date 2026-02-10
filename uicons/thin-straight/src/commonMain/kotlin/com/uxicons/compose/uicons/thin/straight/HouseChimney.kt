package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HouseChimney: ImageVector? = null

val Icons.Ts.HouseChimney: ImageVector
    get() = _HouseChimney ?: UXIcon(name = "HouseChimney") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23.05f, 8.04f)
                lineToRelative(-2.04f, -1.61f)
                lineTo(21f, 2f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(3.64f)
                lineTo(13.54f, 0.57f)
                curveToRelative(-0.91f, -0.71f, -2.18f, -0.71f, -3.09f, 0f)
                lineTo(0.95f, 8.04f)
                curveToRelative(-0.61f, 0.48f, -0.95f, 1.19f, -0.95f, 1.97f)
                verticalLineToRelative(14f)
                lineTo(8f, 24f)
                lineTo(8f, 14.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(5f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                verticalLineToRelative(9.5f)
                horizontalLineToRelative(8f)
                lineTo(24f, 10f)
                curveToRelative(0f, -0.77f, -0.35f, -1.49f, -0.95f, -1.97f)
                close()
                moveTo(23f, 23f)
                horizontalLineToRelative(-6f)
                lineTo(17f, 14.5f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                horizontalLineToRelative(-5f)
                curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
                verticalLineToRelative(8.5f)
                lineTo(1f, 23f)
                lineTo(1f, 10f)
                curveToRelative(0f, -0.46f, 0.21f, -0.89f, 0.57f, -1.18f)
                lineTo(11.07f, 1.35f)
                curveToRelative(0.55f, -0.43f, 1.31f, -0.43f, 1.85f, 0f)
                lineToRelative(9.5f, 7.47f)
                curveToRelative(0.36f, 0.29f, 0.57f, 0.72f, 0.57f, 1.18f)
                verticalLineToRelative(13f)
                close()
            }
        }.also { _HouseChimney = it}
