package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CrossReligion: ImageVector? = null

val Icons.Ts.CrossReligion: ImageVector
    get() = _CrossReligion ?: UXIcon(name = "CrossReligion") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(15f, 24f)
                horizontalLineToRelative(-6f)
                lineTo(9f, 13f)
                lineTo(2f, 13f)
                verticalLineToRelative(-3.5f)
                curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                horizontalLineToRelative(4.5f)
                lineTo(9f, 2.5f)
                curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                horizontalLineToRelative(1f)
                curveToRelative(1.38f, 0f, 2.5f, 1.12f, 2.5f, 2.5f)
                lineTo(15f, 7f)
                horizontalLineToRelative(4.5f)
                curveToRelative(1.38f, 0f, 2.5f, 1.12f, 2.5f, 2.5f)
                verticalLineToRelative(3.5f)
                horizontalLineToRelative(-7f)
                verticalLineToRelative(11f)
                close()
                moveTo(10f, 23f)
                horizontalLineToRelative(4f)
                lineTo(14f, 12f)
                horizontalLineToRelative(7f)
                verticalLineToRelative(-2.5f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                horizontalLineToRelative(-5.5f)
                lineTo(14f, 2.5f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                horizontalLineToRelative(-1f)
                curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
                verticalLineToRelative(5.5f)
                lineTo(4.5f, 8f)
                curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
                verticalLineToRelative(2.5f)
                horizontalLineToRelative(7f)
                verticalLineToRelative(11f)
                close()
            }
        }.also { _CrossReligion = it}
