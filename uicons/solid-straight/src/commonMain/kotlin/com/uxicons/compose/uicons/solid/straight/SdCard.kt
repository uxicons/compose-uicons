package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SdCard: ImageVector? = null

val Icons.Ss.SdCard: ImageVector
    get() = _SdCard ?: UXIcon(name = "SdCard") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(18f, 0f)
                horizontalLineToRelative(-7.76f)
                curveToRelative(-1.05f, 0f, -2.08f, 0.43f, -2.83f, 1.17f)
                lineToRelative(-3.24f, 3.24f)
                curveToRelative(-0.76f, 0.76f, -1.17f, 1.76f, -1.17f, 2.83f)
                verticalLineToRelative(16.76f)
                horizontalLineToRelative(18f)
                lineTo(21f, 3f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                close()
                moveTo(10f, 7f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-3f)
                curveToRelative(0.39f, -0.39f, 0.61f, -0.61f, 1f, -1f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(4f)
                close()
                moveTo(14f, 7f)
                horizontalLineToRelative(-2f)
                lineTo(12f, 3f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(4f)
                close()
                moveTo(18f, 7f)
                horizontalLineToRelative(-2f)
                lineTo(16f, 3f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(4f)
                close()
            }
        }.also { _SdCard = it}
