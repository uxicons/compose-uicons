package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SimCard: ImageVector? = null

val Icons.Tr.SimCard: ImageVector
    get() = _SimCard ?: UXIcon(name = "SimCard") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(19.68f, 3.98f)
                lineToRelative(-2.66f, -2.66f)
                curveToRelative(-0.85f, -0.85f, -1.98f, -1.32f, -3.18f, -1.32f)
                horizontalLineToRelative(-6.34f)
                curveTo(5.02f, 0f, 3f, 2.02f, 3f, 4.5f)
                verticalLineToRelative(15f)
                curveToRelative(0f, 2.48f, 2.02f, 4.5f, 4.5f, 4.5f)
                horizontalLineToRelative(9f)
                curveToRelative(2.48f, 0f, 4.5f, -2.02f, 4.5f, -4.5f)
                lineTo(21f, 7.16f)
                curveToRelative(0f, -1.2f, -0.47f, -2.33f, -1.32f, -3.18f)
                close()
                moveTo(20f, 19.5f)
                curveToRelative(0f, 1.93f, -1.57f, 3.5f, -3.5f, 3.5f)
                lineTo(7.5f, 23f)
                curveToRelative(-1.93f, 0f, -3.5f, -1.57f, -3.5f, -3.5f)
                lineTo(4f, 4.5f)
                curveToRelative(0f, -1.93f, 1.57f, -3.5f, 3.5f, -3.5f)
                horizontalLineToRelative(6.34f)
                curveToRelative(0.94f, 0f, 1.81f, 0.36f, 2.48f, 1.02f)
                lineToRelative(2.66f, 2.66f)
                curveToRelative(0.66f, 0.66f, 1.02f, 1.54f, 1.02f, 2.48f)
                verticalLineToRelative(12.34f)
                close()
                moveTo(15.5f, 12f)
                horizontalLineToRelative(-7f)
                curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
                verticalLineToRelative(4f)
                curveToRelative(0f, 1.38f, 1.12f, 2.5f, 2.5f, 2.5f)
                horizontalLineToRelative(7f)
                curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
                verticalLineToRelative(-4f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                close()
                moveTo(17f, 14.5f)
                verticalLineToRelative(1.5f)
                horizontalLineToRelative(-6f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(4.5f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                close()
                moveTo(8.5f, 13f)
                horizontalLineToRelative(1.5f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-1.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                close()
                moveTo(7f, 18.5f)
                verticalLineToRelative(-1.5f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-4.5f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                close()
                moveTo(15.5f, 20f)
                horizontalLineToRelative(-1.5f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(1.5f)
                curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                close()
            }
        }.also { _SimCard = it}
