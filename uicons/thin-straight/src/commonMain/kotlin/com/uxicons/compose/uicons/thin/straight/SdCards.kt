package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SdCards: ImageVector? = null

val Icons.Ts.SdCards: ImageVector
    get() = _SdCards ?: UXIcon(name = "SdCards") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(3f, 23f)
                horizontalLineToRelative(16f)
                verticalLineToRelative(1f)
                lineTo(2f, 24f)
                lineTo(2f, 5.5f)
                curveToRelative(0f, -0.82f, 0.39f, -1.54f, 1f, -2.0f)
                verticalLineToRelative(19.5f)
                close()
                moveTo(22f, 2.5f)
                verticalLineToRelative(18.5f)
                lineTo(5f, 21f)
                lineTo(5f, 5.33f)
                curveToRelative(0f, -0.67f, 0.26f, -1.29f, 0.73f, -1.77f)
                lineToRelative(2.83f, -2.83f)
                curveToRelative(0.47f, -0.47f, 1.1f, -0.73f, 1.77f, -0.73f)
                horizontalLineToRelative(9.17f)
                curveToRelative(1.38f, 0f, 2.5f, 1.12f, 2.5f, 2.5f)
                close()
                moveTo(21f, 2.5f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                horizontalLineToRelative(-9.17f)
                curveToRelative(-0.4f, 0f, -0.78f, 0.16f, -1.06f, 0.44f)
                lineToRelative(-2.83f, 2.83f)
                curveToRelative(-0.28f, 0.28f, -0.44f, 0.67f, -0.44f, 1.06f)
                verticalLineToRelative(14.67f)
                horizontalLineToRelative(15f)
                lineTo(21.0f, 2.5f)
                close()
                moveTo(18f, 6f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(3f)
                close()
                moveTo(16f, 6f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(3f)
                close()
                moveTo(14f, 6f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(3f)
                close()
                moveTo(12f, 6f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(3f)
                close()
                moveTo(10f, 6f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(3f)
                close()
            }
        }.also { _SdCards = it}
