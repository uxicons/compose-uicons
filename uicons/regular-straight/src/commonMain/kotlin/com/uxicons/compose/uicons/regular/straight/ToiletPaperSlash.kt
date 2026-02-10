package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ToiletPaperSlash: ImageVector? = null

val Icons.Rs.ToiletPaperSlash: ImageVector
    get() = _ToiletPaperSlash ?: UXIcon(name = "ToiletPaperSlash") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(18f, 8.5f)
                curveToRelative(0f, -1.38f, 0.45f, -2.5f, 1f, -2.5f)
                reflectiveCurveToRelative(1f, 1.12f, 1f, 2.5f)
                reflectiveCurveToRelative(-0.45f, 2.5f, -1f, 2.5f)
                reflectiveCurveToRelative(-1f, -1.12f, -1f, -2.5f)
                close()
                moveTo(18.41f, 17f)
                lineToRelative(5.54f, 5.54f)
                lineToRelative(-1.41f, 1.41f)
                lineTo(0.04f, 1.46f)
                lineTo(1.46f, 0.04f)
                lineToRelative(2.05f, 2.05f)
                curveToRelative(0.92f, -1.34f, 2.15f, -2.09f, 3.49f, -2.09f)
                horizontalLineToRelative(12f)
                curveToRelative(2.8f, 0f, 5f, 3.73f, 5f, 8.5f)
                reflectiveCurveToRelative(-2.2f, 8.5f, -5f, 8.5f)
                horizontalLineToRelative(-0.59f)
                close()
                moveTo(19f, 2f)
                curveToRelative(-1.42f, 0f, -3f, 2.67f, -3f, 6.5f)
                reflectiveCurveToRelative(1.58f, 6.5f, 3f, 6.5f)
                reflectiveCurveToRelative(3f, -2.67f, 3f, -6.5f)
                reflectiveCurveToRelative(-1.58f, -6.5f, -3f, -6.5f)
                close()
                moveTo(4.96f, 3.54f)
                lineToRelative(9.04f, 9.04f)
                verticalLineToRelative(-4.09f)
                curveToRelative(0f, -2.63f, 0.67f, -4.95f, 1.75f, -6.5f)
                lineTo(7f, 2f)
                curveToRelative(-0.73f, 0f, -1.48f, 0.57f, -2.04f, 1.54f)
                close()
                moveTo(14f, 20f)
                curveToRelative(0f, 1.1f, -0.9f, 2f, -2f, 2f)
                lineTo(3.46f, 22f)
                curveToRelative(0.34f, -0.59f, 0.54f, -1.27f, 0.54f, -2f)
                verticalLineToRelative(-11.76f)
                lineToRelative(-1.94f, -1.94f)
                curveToRelative(-0.04f, 0.39f, -0.06f, 0.79f, -0.06f, 1.2f)
                verticalLineToRelative(12.5f)
                curveToRelative(0f, 1.1f, -0.9f, 2f, -2f, 2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(12f)
                curveToRelative(2.13f, 0f, 3.87f, -1.67f, 3.99f, -3.77f)
                lineToRelative(-1.99f, -1.99f)
                verticalLineToRelative(1.76f)
                close()
            }
        }.also { _ToiletPaperSlash = it}
