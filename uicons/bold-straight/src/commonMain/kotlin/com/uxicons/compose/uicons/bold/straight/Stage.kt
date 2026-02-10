package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Stage: ImageVector? = null

val Icons.Bs.Stage: ImageVector
    get() = _Stage ?: UXIcon(name = "Stage") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(18.62f, 21f)
                lineToRelative(-5.12f, -5.12f)
                lineTo(13.5f, 7.62f)
                lineToRelative(1.73f, -1.73f)
                curveToRelative(0.25f, 0.07f, 0.5f, 0.11f, 0.77f, 0.11f)
                curveToRelative(1.66f, 0f, 3f, -1.34f, 3f, -3f)
                reflectiveCurveToRelative(-1.34f, -3f, -3f, -3f)
                reflectiveCurveToRelative(-3f, 1.34f, -3f, 3f)
                curveToRelative(0f, 0.27f, 0.05f, 0.52f, 0.11f, 0.77f)
                lineToRelative(-6.17f, 6.17f)
                lineToRelative(2.12f, 2.12f)
                lineToRelative(1.44f, -1.44f)
                verticalLineToRelative(5.26f)
                lineToRelative(-5.12f, 5.12f)
                lineTo(0f, 21f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-5.38f)
                close()
                moveTo(12f, 18.62f)
                lineToRelative(2.38f, 2.38f)
                horizontalLineToRelative(-4.76f)
                lineToRelative(2.38f, -2.38f)
                close()
            }
        }.also { _Stage = it}
