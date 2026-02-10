package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TextWidth: ImageVector? = null

val Icons.Ss.TextWidth: ImageVector
    get() = _TextWidth ?: UXIcon(name = "TextWidth") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(6f, 5f)
                horizontalLineToRelative(-2f)
                lineTo(4f, 3f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                horizontalLineToRelative(10f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-2f)
                lineTo(18f, 3f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                horizontalLineToRelative(-4f)
                lineTo(13f, 15f)
                horizontalLineToRelative(-2f)
                lineTo(11f, 2f)
                lineTo(7f, 2f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                verticalLineToRelative(2f)
                close()
                moveTo(23.42f, 17.55f)
                lineToRelative(-3.26f, -3.26f)
                lineToRelative(-1.41f, 1.41f)
                lineToRelative(2.3f, 2.29f)
                lineTo(2.96f, 17.99f)
                lineToRelative(2.29f, -2.29f)
                lineToRelative(-1.41f, -1.41f)
                lineToRelative(-3.26f, 3.25f)
                curveToRelative(-0.38f, 0.38f, -0.58f, 0.88f, -0.58f, 1.41f)
                reflectiveCurveToRelative(0.21f, 1.03f, 0.58f, 1.41f)
                lineToRelative(3.26f, 3.26f)
                lineToRelative(1.41f, -1.41f)
                lineToRelative(-2.21f, -2.2f)
                lineTo(20.95f, 20.01f)
                lineToRelative(-2.2f, 2.2f)
                lineToRelative(1.41f, 1.41f)
                lineToRelative(3.26f, -3.25f)
                curveToRelative(0.38f, -0.38f, 0.58f, -0.88f, 0.58f, -1.41f)
                reflectiveCurveToRelative(-0.21f, -1.03f, -0.58f, -1.41f)
                close()
            }
        }.also { _TextWidth = it}
