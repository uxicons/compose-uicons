package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TentArrowDownToLine: ImageVector? = null

val Icons.Rs.TentArrowDownToLine: ImageVector
    get() = _TentArrowDownToLine ?: UXIcon(name = "TentArrowDownToLine") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23.59f, 20.12f)
                lineTo(13.98f, 6.76f)
                lineTo(3.48f, 22f)
                lineTo(0f, 22f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(21.43f)
                curveToRelative(0.94f, 0f, 1.79f, -0.5f, 2.25f, -1.3f)
                curveToRelative(0.45f, -0.79f, 0.43f, -1.73f, -0.09f, -2.57f)
                close()
                moveTo(12.56f, 22f)
                lineToRelative(1.44f, -2.19f)
                lineToRelative(1.44f, 2.19f)
                horizontalLineToRelative(-2.89f)
                close()
                moveTo(21.94f, 21.72f)
                curveToRelative(-0.05f, 0.09f, -0.19f, 0.28f, -0.5f, 0.28f)
                horizontalLineToRelative(-3.59f)
                lineToRelative(-3.84f, -5.81f)
                lineToRelative(-3.84f, 5.81f)
                horizontalLineToRelative(-4.25f)
                lineToRelative(8.11f, -11.76f)
                lineToRelative(7.91f, 10.99f)
                curveToRelative(0.13f, 0.21f, 0.06f, 0.4f, 0.01f, 0.49f)
                close()
                moveTo(3.59f, 8.42f)
                lineTo(0.29f, 5.12f)
                lineToRelative(1.41f, -1.41f)
                lineToRelative(2.29f, 2.29f)
                lineTo(4f, 0f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(6.01f)
                lineToRelative(2.29f, -2.3f)
                lineToRelative(1.41f, 1.41f)
                lineToRelative(-3.3f, 3.3f)
                curveToRelative(-0.39f, 0.39f, -0.9f, 0.58f, -1.41f, 0.58f)
                reflectiveCurveToRelative(-1.02f, -0.19f, -1.41f, -0.58f)
                close()
            }
        }.also { _TentArrowDownToLine = it}
