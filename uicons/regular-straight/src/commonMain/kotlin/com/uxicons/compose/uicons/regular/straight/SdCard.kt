package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SdCard: ImageVector? = null

val Icons.Rs.SdCard: ImageVector
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
                moveTo(19f, 22f)
                lineTo(5f, 22f)
                lineTo(5f, 7.24f)
                curveToRelative(0f, -0.53f, 0.21f, -1.04f, 0.59f, -1.42f)
                lineToRelative(3.24f, -3.24f)
                curveToRelative(0.37f, -0.37f, 0.89f, -0.59f, 1.41f, -0.59f)
                horizontalLineToRelative(7.76f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                verticalLineToRelative(19f)
                close()
                moveTo(15f, 4f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-4f)
                close()
                moveTo(12f, 4f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-4f)
                close()
                moveTo(10f, 4f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-3f)
                curveToRelative(0.39f, -0.39f, 0.61f, -0.61f, 1f, -1f)
                close()
            }
        }.also { _SdCard = it}
