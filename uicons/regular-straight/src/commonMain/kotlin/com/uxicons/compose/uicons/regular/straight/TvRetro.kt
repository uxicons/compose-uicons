package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TvRetro: ImageVector? = null

val Icons.Rs.TvRetro: ImageVector
    get() = _TvRetro ?: UXIcon(name = "TvRetro") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21f, 6f)
                horizontalLineToRelative(-6.86f)
                lineToRelative(4.58f, -4.58f)
                lineTo(17.3f, 0.01f)
                lineToRelative(-5.3f, 5.3f)
                lineTo(6.7f, 0.01f)
                lineToRelative(-1.41f, 1.41f)
                lineToRelative(4.58f, 4.58f)
                lineTo(3f, 6f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                verticalLineToRelative(15f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(-15f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                close()
                moveTo(22f, 22f)
                lineTo(2f, 22f)
                verticalLineToRelative(-13f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(18f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                verticalLineToRelative(13f)
                close()
                moveTo(4f, 20f)
                horizontalLineToRelative(12f)
                verticalLineToRelative(-10f)
                lineTo(4f, 10f)
                verticalLineToRelative(10f)
                close()
                moveTo(6f, 12f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(6f)
                lineTo(6f, 18f)
                verticalLineToRelative(-6f)
                close()
                moveTo(18f, 10f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-2f)
                close()
                moveTo(18f, 14f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-2f)
                close()
                moveTo(18f, 18f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-2f)
                close()
            }
        }.also { _TvRetro = it}
