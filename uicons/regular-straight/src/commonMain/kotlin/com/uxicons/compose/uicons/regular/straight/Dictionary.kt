package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Dictionary: ImageVector? = null

val Icons.Rs.Dictionary: ImageVector
    get() = _Dictionary ?: UXIcon(name = "Dictionary") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(6.82f, 12f)
                horizontalLineToRelative(2.15f)
                lineToRelative(0.22f, 0.99f)
                horizontalLineToRelative(1.67f)
                lineToRelative(-1.27f, -5.57f)
                curveToRelative(-0.31f, -1.85f, -2.97f, -1.84f, -3.3f, -0.04f)
                lineToRelative(-1.29f, 5.61f)
                horizontalLineToRelative(1.58f)
                lineToRelative(0.24f, -0.99f)
                close()
                moveTo(7.85f, 7.72f)
                curveToRelative(0.02f, -0.07f, 0.05f, -0.12f, 0.1f, -0.12f)
                curveToRelative(0.01f, 0.01f, 0.06f, 0.06f, 0.08f, 0.18f)
                lineToRelative(0.58f, 2.62f)
                horizontalLineToRelative(-1.41f)
                lineToRelative(0.65f, -2.68f)
                close()
                moveTo(13.5f, 10f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-1.6f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(1.6f)
                close()
                moveTo(19f, 13f)
                horizontalLineToRelative(-4.55f)
                verticalLineToRelative(-1.72f)
                lineToRelative(2.56f, -3.69f)
                horizontalLineToRelative(-2.56f)
                verticalLineToRelative(-1.6f)
                horizontalLineToRelative(4.55f)
                verticalLineToRelative(1.72f)
                lineToRelative(-2.56f, 3.69f)
                horizontalLineToRelative(2.56f)
                verticalLineToRelative(1.6f)
                close()
                moveTo(20f, 0f)
                lineTo(5f, 0f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                lineTo(2f, 21f)
                curveToRelative(0f, 1.65f, 1.35f, 3f, 3f, 3f)
                lineTo(22f, 24f)
                lineTo(22f, 2f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                close()
                moveTo(5f, 2f)
                horizontalLineToRelative(15f)
                lineTo(20f, 18f)
                lineTo(5f, 18f)
                curveToRelative(-0.35f, 0f, -0.69f, 0.07f, -1f, 0.18f)
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
        }.also { _Dictionary = it}
