package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _DiagramPrevious: ImageVector? = null

val Icons.Rs.DiagramPrevious: ImageVector
    get() = _DiagramPrevious ?: UXIcon(name = "DiagramPrevious") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(13f, 10f)
                horizontalLineToRelative(3f)
                lineToRelative(-3.16f, -3.65f)
                curveToRelative(-0.44f, -0.49f, -1.22f, -0.49f, -1.66f, 0f)
                lineToRelative(-3.18f, 3.65f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(4f)
                lineTo(0f, 14f)
                verticalLineToRelative(7f)
                curveToRelative(0f, 1.65f, 1.35f, 3f, 3f, 3f)
                lineTo(21f, 24f)
                curveToRelative(1.65f, 0f, 3f, -1.35f, 3f, -3f)
                verticalLineToRelative(-7f)
                lineTo(13f, 14f)
                verticalLineToRelative(-4f)
                close()
                moveTo(22f, 21f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                lineTo(3f, 22f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                verticalLineToRelative(-5f)
                lineTo(22f, 16f)
                verticalLineToRelative(5f)
                close()
                moveTo(21f, 0f)
                lineTo(3f, 0f)
                curveTo(1.35f, 0f, 0f, 1.35f, 0f, 3f)
                verticalLineToRelative(7f)
                lineTo(5.41f, 10f)
                lineTo(13.41f, 2f)
                horizontalLineToRelative(3.17f)
                lineToRelative(-2.65f, 2.65f)
                curveToRelative(0.14f, 0.11f, 0.28f, 0.23f, 0.4f, 0.36f)
                lineToRelative(0.96f, 1.11f)
                lineToRelative(4.12f, -4.12f)
                horizontalLineToRelative(1.59f)
                curveToRelative(0.43f, 0f, 0.79f, 0.27f, 0.94f, 0.65f)
                lineToRelative(-5.17f, 5.17f)
                lineToRelative(1.88f, 2.18f)
                horizontalLineToRelative(5.36f)
                lineTo(24.01f, 3f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                close()
                moveTo(3f, 2f)
                horizontalLineToRelative(1.59f)
                lineToRelative(-2.59f, 2.59f)
                verticalLineToRelative(-1.59f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                close()
                moveTo(4.59f, 8f)
                lineTo(2f, 8f)
                verticalLineToRelative(-0.59f)
                lineTo(7.41f, 2f)
                horizontalLineToRelative(3.17f)
                lineToRelative(-6f, 6f)
                close()
                moveTo(19.42f, 8f)
                lineToRelative(2.59f, -2.59f)
                verticalLineToRelative(2.59f)
                horizontalLineToRelative(-2.59f)
                close()
            }
        }.also { _DiagramPrevious = it}
