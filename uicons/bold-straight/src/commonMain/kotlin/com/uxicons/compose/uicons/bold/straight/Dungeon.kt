package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Dungeon: ImageVector? = null

val Icons.Bs.Dungeon: ImageVector
    get() = _Dungeon ?: UXIcon(name = "Dungeon") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(14f, 12f)
                verticalLineToRelative(12f)
                horizontalLineToRelative(-4f)
                lineTo(10f, 12f)
                curveToRelative(0f, -1.1f, 0.9f, -2f, 2f, -2f)
                reflectiveCurveToRelative(2f, 0.9f, 2f, 2f)
                close()
                moveTo(24f, 12f)
                verticalLineToRelative(12f)
                horizontalLineToRelative(-8f)
                lineTo(16f, 12f)
                curveToRelative(0f, -2.21f, -1.79f, -4f, -4f, -4f)
                reflectiveCurveToRelative(-4f, 1.79f, -4f, 4f)
                verticalLineToRelative(12f)
                lineTo(0f, 24f)
                lineTo(0f, 12f)
                curveTo(0f, 5.38f, 5.38f, 0f, 12f, 0f)
                reflectiveCurveToRelative(12f, 5.38f, 12f, 12f)
                close()
                moveTo(19f, 12f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-2f)
                curveToRelative(0f, -1.17f, -0.23f, -2.28f, -0.64f, -3.3f)
                lineToRelative(-1.74f, 1.05f)
                curveToRelative(0.24f, 0.71f, 0.38f, 1.46f, 0.38f, 2.25f)
                close()
                moveTo(5.38f, 9.75f)
                lineToRelative(-1.74f, -1.05f)
                curveToRelative(-0.41f, 1.02f, -0.64f, 2.14f, -0.64f, 3.3f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-2f)
                curveToRelative(0f, -0.79f, 0.14f, -1.54f, 0.38f, -2.25f)
                close()
                moveTo(5f, 21f)
                verticalLineToRelative(-4f)
                lineTo(3f, 17f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(2f)
                close()
                moveTo(10.5f, 5.17f)
                lineTo(10.5f, 3.13f)
                curveToRelative(-2.11f, 0.36f, -3.97f, 1.44f, -5.31f, 3.0f)
                lineToRelative(1.74f, 1.05f)
                curveToRelative(0.95f, -0.99f, 2.18f, -1.71f, 3.57f, -2.02f)
                close()
                moveTo(17.07f, 7.18f)
                lineToRelative(1.74f, -1.05f)
                curveToRelative(-1.34f, -1.55f, -3.2f, -2.64f, -5.31f, -3.0f)
                verticalLineToRelative(2.03f)
                curveToRelative(1.39f, 0.3f, 2.62f, 1.02f, 3.57f, 2.02f)
                close()
                moveTo(21f, 21f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(2f)
                close()
            }
        }.also { _Dungeon = it}
