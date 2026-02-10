package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _NewsletterSubscribe: ImageVector? = null

val Icons.Rs.NewsletterSubscribe: ImageVector
    get() = _NewsletterSubscribe ?: UXIcon(name = "NewsletterSubscribe") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22.77f, 9.34f)
                lineToRelative(-1.77f, -1.69f)
                lineTo(21f, 3f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                lineTo(6f, 0f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                verticalLineToRelative(4.65f)
                lineToRelative(-1.77f, 1.69f)
                curveTo(0.45f, 10.09f, 0.0f, 11.15f, 0.0f, 12.23f)
                lineToRelative(-0.0f, 11.77f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(-11.77f)
                curveToRelative(0f, -1.09f, -0.45f, -2.14f, -1.23f, -2.89f)
                close()
                moveTo(6f, 2f)
                horizontalLineToRelative(12f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                verticalLineToRelative(9.24f)
                lineToRelative(-4.88f, 4.88f)
                curveToRelative(-1.13f, 1.13f, -3.11f, 1.13f, -4.24f, 0f)
                lineToRelative(-4.88f, -4.88f)
                lineTo(5f, 3f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                close()
                moveTo(22f, 22f)
                lineTo(2f, 22f)
                reflectiveCurveToRelative(-0.0f, -9.87f, 0f, -9.91f)
                lineToRelative(6.46f, 6.45f)
                curveToRelative(0.94f, 0.94f, 2.2f, 1.47f, 3.54f, 1.47f)
                reflectiveCurveToRelative(2.59f, -0.52f, 3.54f, -1.47f)
                lineToRelative(6.46f, -6.45f)
                curveToRelative(0.0f, 0.05f, 0f, 9.91f, 0f, 9.91f)
                close()
                moveTo(9.59f, 11.41f)
                lineToRelative(-2.78f, -2.7f)
                lineToRelative(1.39f, -1.44f)
                lineToRelative(2.79f, 2.71f)
                lineToRelative(4.81f, -4.7f)
                lineToRelative(1.4f, 1.43f)
                lineToRelative(-4.79f, 4.71f)
                curveToRelative(-0.39f, 0.39f, -0.9f, 0.58f, -1.41f, 0.58f)
                reflectiveCurveToRelative(-1.02f, -0.2f, -1.42f, -0.59f)
                close()
            }
        }.also { _NewsletterSubscribe = it}
