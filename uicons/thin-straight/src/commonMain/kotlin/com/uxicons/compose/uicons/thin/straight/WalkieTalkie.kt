package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _WalkieTalkie: ImageVector? = null

val Icons.Ts.WalkieTalkie: ImageVector
    get() = _WalkieTalkie ?: UXIcon(name = "WalkieTalkie") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(18.5f, 3f)
                horizontalLineToRelative(-7.5f)
                lineTo(11f, 1f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-3f)
                lineTo(7f, 0f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-0.5f)
                curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
                verticalLineToRelative(6.54f)
                curveToRelative(0f, 0.7f, 0.13f, 1.39f, 0.39f, 2.04f)
                lineToRelative(0.61f, 1.52f)
                verticalLineToRelative(8.4f)
                horizontalLineToRelative(16f)
                verticalLineToRelative(-8.4f)
                lineToRelative(0.61f, -1.52f)
                curveToRelative(0.26f, -0.65f, 0.39f, -1.34f, 0.39f, -2.04f)
                verticalLineToRelative(-6.54f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                close()
                moveTo(20f, 12.04f)
                curveToRelative(0f, 0.57f, -0.11f, 1.14f, -0.32f, 1.67f)
                lineToRelative(-0.64f, 1.61f)
                lineToRelative(-0.04f, 7.69f)
                lineTo(5f, 23f)
                verticalLineToRelative(-7.5f)
                lineToRelative(-0.68f, -1.79f)
                curveToRelative(-0.21f, -0.54f, -0.32f, -1.1f, -0.32f, -1.67f)
                verticalLineToRelative(-6.54f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(13f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                verticalLineToRelative(6.54f)
                close()
                moveTo(6f, 12f)
                horizontalLineToRelative(12f)
                verticalLineToRelative(-6f)
                lineTo(6f, 6f)
                verticalLineToRelative(6f)
                close()
                moveTo(7f, 7f)
                horizontalLineToRelative(10f)
                verticalLineToRelative(4f)
                lineTo(7f, 11f)
                verticalLineToRelative(-4f)
                close()
            }
        }.also { _WalkieTalkie = it}
