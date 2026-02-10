package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BookQuran: ImageVector? = null

val Icons.Rs.BookQuran: ImageVector
    get() = _BookQuran ?: UXIcon(name = "BookQuran") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(19f, 0f)
                lineTo(4f, 0f)
                curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                verticalLineToRelative(22f)
                horizontalLineToRelative(17f)
                curveToRelative(1.65f, 0f, 3f, -1.35f, 3f, -3f)
                lineTo(22f, 3f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                close()
                moveTo(19f, 2f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                verticalLineToRelative(15.17f)
                curveToRelative(-0.31f, -0.11f, -0.65f, -0.17f, -1f, -0.17f)
                lineTo(4f, 18f)
                lineTo(4f, 2f)
                horizontalLineToRelative(15f)
                close()
                moveTo(19f, 22f)
                lineTo(4f, 22f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(15f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                close()
                moveTo(7f, 10f)
                curveToRelative(0f, -2.76f, 2.24f, -5f, 5f, -5f)
                curveToRelative(0.59f, 0f, 1.15f, 0.11f, 1.68f, 0.3f)
                curveToRelative(-1.94f, 0.69f, -3.34f, 2.52f, -3.34f, 4.7f)
                reflectiveCurveToRelative(1.4f, 4.01f, 3.34f, 4.7f)
                curveToRelative(-0.52f, 0.19f, -1.08f, 0.3f, -1.68f, 0.3f)
                curveToRelative(-2.76f, 0f, -5f, -2.24f, -5f, -5f)
                close()
                moveTo(12f, 9f)
                horizontalLineToRelative(1.81f)
                lineToRelative(0.49f, -1.88f)
                horizontalLineToRelative(0.4f)
                lineToRelative(0.49f, 1.88f)
                horizontalLineToRelative(1.8f)
                verticalLineToRelative(0.38f)
                lineToRelative(-1.38f, 0.8f)
                lineToRelative(0.55f, 1.68f)
                lineToRelative(-0.31f, 0.22f)
                lineToRelative(-1.36f, -1.05f)
                lineToRelative(-1.36f, 1.05f)
                lineToRelative(-0.3f, -0.23f)
                lineToRelative(0.54f, -1.7f)
                lineToRelative(-1.38f, -0.77f)
                verticalLineToRelative(-0.38f)
                close()
            }
        }.also { _BookQuran = it}
