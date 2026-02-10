package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Clapperboard: ImageVector? = null

val Icons.Tr.Clapperboard: ImageVector
    get() = _Clapperboard ?: UXIcon(name = "Clapperboard") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(19.5f, 1f)
                lineTo(4.5f, 1f)
                curveTo(2.02f, 1f, 0f, 3.02f, 0f, 5.5f)
                verticalLineToRelative(13f)
                curveToRelative(0f, 2.48f, 2.02f, 4.5f, 4.5f, 4.5f)
                horizontalLineToRelative(15f)
                curveToRelative(2.48f, 0f, 4.5f, -2.02f, 4.5f, -4.5f)
                lineTo(24f, 5.5f)
                curveToRelative(0f, -2.48f, -2.02f, -4.5f, -4.5f, -4.5f)
                close()
                moveTo(19.5f, 2f)
                curveToRelative(0.28f, 0f, 0.56f, 0.03f, 0.82f, 0.1f)
                lineToRelative(-4.9f, 4.9f)
                horizontalLineToRelative(-4.84f)
                lineToRelative(5f, -5f)
                horizontalLineToRelative(3.92f)
                close()
                moveTo(14.17f, 2f)
                lineToRelative(-5f, 5f)
                horizontalLineToRelative(-4.94f)
                lineToRelative(5.11f, -5f)
                horizontalLineToRelative(4.84f)
                close()
                moveTo(1f, 5.5f)
                curveToRelative(0f, -1.93f, 1.57f, -3.5f, 3.5f, -3.5f)
                horizontalLineToRelative(3.4f)
                lineTo(2.8f, 7f)
                horizontalLineToRelative(-1.8f)
                verticalLineToRelative(-1.5f)
                close()
                moveTo(23f, 18.5f)
                curveToRelative(0f, 1.93f, -1.57f, 3.5f, -3.5f, 3.5f)
                lineTo(4.5f, 22f)
                curveToRelative(-1.93f, 0f, -3.5f, -1.57f, -3.5f, -3.5f)
                verticalLineToRelative(-10.5f)
                horizontalLineToRelative(22f)
                verticalLineToRelative(10.5f)
                close()
                moveTo(23f, 7f)
                horizontalLineToRelative(-6.17f)
                lineToRelative(4.49f, -4.49f)
                curveToRelative(1.01f, 0.61f, 1.68f, 1.72f, 1.68f, 2.99f)
                verticalLineToRelative(1.5f)
                close()
            }
        }.also { _Clapperboard = it}
