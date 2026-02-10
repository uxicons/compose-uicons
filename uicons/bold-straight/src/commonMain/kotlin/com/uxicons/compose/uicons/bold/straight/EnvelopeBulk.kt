package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _EnvelopeBulk: ImageVector? = null

val Icons.Bs.EnvelopeBulk: ImageVector
    get() = _EnvelopeBulk ?: UXIcon(name = "EnvelopeBulk") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 10.5f)
                curveToRelative(0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                horizontalLineToRelative(-1.5f)
                lineTo(19f, 3.5f)
                curveToRelative(0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                lineTo(6.5f, 0f)
                curveToRelative(-1.93f, 0f, -3.5f, 1.57f, -3.5f, 3.5f)
                verticalLineToRelative(6.54f)
                curveToRelative(-1.69f, 0.24f, -3f, 1.7f, -3f, 3.46f)
                verticalLineToRelative(10.5f)
                lineTo(16f, 24f)
                verticalLineToRelative(-5f)
                horizontalLineToRelative(8f)
                lineTo(24f, 10.5f)
                close()
                moveTo(6.5f, 3f)
                lineTo(15.5f, 3f)
                curveToRelative(0.28f, 0f, 0.5f, 0.23f, 0.5f, 0.5f)
                verticalLineToRelative(3.5f)
                horizontalLineToRelative(-4.5f)
                curveToRelative(-1.76f, 0f, -3.22f, 1.31f, -3.46f, 3f)
                horizontalLineToRelative(-2.04f)
                lineTo(6f, 3.5f)
                curveToRelative(0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f)
                close()
                moveTo(11.38f, 13f)
                lineToRelative(-2.74f, 2.74f)
                curveToRelative(-0.34f, 0.34f, -0.93f, 0.34f, -1.27f, 0f)
                lineToRelative(-2.74f, -2.74f)
                horizontalLineToRelative(6.74f)
                close()
                moveTo(13f, 21f)
                lineTo(3f, 21f)
                verticalLineToRelative(-5.39f)
                lineToRelative(2.25f, 2.25f)
                curveToRelative(0.74f, 0.74f, 1.72f, 1.14f, 2.76f, 1.14f)
                reflectiveCurveToRelative(2.02f, -0.41f, 2.75f, -1.14f)
                lineToRelative(2.24f, -2.24f)
                verticalLineToRelative(5.38f)
                close()
                moveTo(21f, 13f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(3f)
                close()
            }
        }.also { _EnvelopeBulk = it}
