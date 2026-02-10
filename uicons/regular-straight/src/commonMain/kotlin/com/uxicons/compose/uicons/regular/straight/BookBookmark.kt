package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BookBookmark: ImageVector? = null

val Icons.Rs.BookBookmark: ImageVector
    get() = _BookBookmark ?: UXIcon(name = "BookBookmark") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20f, 0f)
                lineTo(5f, 0f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                lineTo(2f, 21f)
                curveToRelative(0f, 1.65f, 1.35f, 3f, 3f, 3f)
                lineTo(22f, 24f)
                lineTo(22f, 2f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                close()
                moveTo(20f, 18f)
                lineTo(8f, 18f)
                lineTo(8f, 2f)
                horizontalLineToRelative(4f)
                lineTo(12f, 11f)
                lineToRelative(2.5f, -2.5f)
                lineToRelative(2.5f, 2.5f)
                lineTo(17f, 2f)
                horizontalLineToRelative(3f)
                lineTo(20f, 18f)
                close()
                moveTo(5f, 2f)
                horizontalLineToRelative(1f)
                lineTo(6f, 18f)
                horizontalLineToRelative(-1f)
                curveToRelative(-0.35f, 0f, -0.69f, 0.06f, -1f, 0.17f)
                lineTo(4f, 3f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                close()
                moveTo(5f, 22f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(15f)
                verticalLineToRelative(2f)
                lineTo(5f, 22f)
                close()
            }
        }.also { _BookBookmark = it}
