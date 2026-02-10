package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SdCard: ImageVector? = null

val Icons.Ts.SdCard: ImageVector
    get() = _SdCard ?: UXIcon(name = "SdCard") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(18.5f, 0f)
                horizontalLineToRelative(-8.76f)
                curveToRelative(-0.92f, 0f, -1.82f, 0.37f, -2.48f, 1.02f)
                lineToRelative(-3.24f, 3.24f)
                curveToRelative(-0.66f, 0.66f, -1.02f, 1.54f, -1.02f, 2.48f)
                verticalLineToRelative(17.26f)
                horizontalLineToRelative(18f)
                lineTo(21f, 2.5f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                close()
                moveTo(20f, 23f)
                lineTo(4f, 23f)
                lineTo(4f, 6.74f)
                curveToRelative(0f, -0.67f, 0.26f, -1.29f, 0.73f, -1.77f)
                lineToRelative(3.24f, -3.24f)
                curveToRelative(0.47f, -0.47f, 1.11f, -0.73f, 1.77f, -0.73f)
                horizontalLineToRelative(8.76f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                verticalLineToRelative(20.5f)
                close()
                moveTo(17f, 3f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(-1f)
                lineTo(17f, 3f)
                close()
                moveTo(15f, 3f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(-1f)
                lineTo(15f, 3f)
                close()
                moveTo(13f, 3f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(-1f)
                lineTo(13f, 3f)
                close()
                moveTo(11f, 3f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(-1f)
                lineTo(11f, 3f)
                close()
                moveTo(9f, 3f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(-1f)
                lineTo(9f, 3f)
                close()
            }
        }.also { _SdCard = it}
